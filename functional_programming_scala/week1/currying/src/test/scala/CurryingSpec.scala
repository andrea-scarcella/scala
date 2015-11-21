import fpscala.week1._
import org.scalatest._
import scala.math._

class CurryingSpec extends FlatSpec {

  "A product over [a,b] of a function f (Int->Int)" should " evaluate to 1 if a > b" in {
    val cur = new Currying
		
    val result = cur.product((n:Int) => n)(10,9)
    
    assert(result === 1)
    
  }
it should " evaluate to b! if a=1, b>0 and f:Id" in {
 val cur = new Currying
		val a=1
		val b=5
    val result = cur.product((n:Int) => n)(a,b)
   
    assert(result===120)
  }
  
  
it should " evaluate to a if a=b and f:Id" in {
 val cur = new Currying
		val a=120
		val b=120
    val result = cur.product((n:Int) => n)(a,b)
   
    assert(result===a)
  }
  it should " fail a failing test " in {
    assert(false)
  }
  
}