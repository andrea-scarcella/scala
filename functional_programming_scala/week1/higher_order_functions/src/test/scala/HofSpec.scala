import fpscala.week1._
import org.scalatest._
import scala.math._

class HofSpec extends FlatSpec {

  "A linear sum over [a,b] of a function f (Int->Int)" should " evaluate to 0 if a > b" in {
    val hof = new Hof
		
    val result = hof.sum((n:Int) => n)(10,9)
    
    assert(result === 0)
    
  }

  it should " evaluate to n*(n-1)/2 when n=b-a , a<b and f:Id" in {
  val a=2
  val b=7
  val n0=a*(a+1)/2
  val n1=b*(b+1)/2
  val expected=n1-n0+a
  val hof = new Hof
		
    val result = hof.sum((n:Int)=>n)(a,b)
    assert(result === expected)
  }
  
  it should " fail a failing test " in {
    assert(false)
  }
  
}