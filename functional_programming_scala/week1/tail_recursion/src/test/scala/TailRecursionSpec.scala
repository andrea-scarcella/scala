import fpscala.week1._
import org.scalatest._
import scala.math._

class TailRecursionSpec extends FlatSpec {

  "A tail-recursive factorial" should " evaluate to 1 if argument is 0" in {
    val trf = new TailRecursion
		
    val result = trf.fact(0)
    
    assert(result === 1)
    
  }

  it should " terminate for large inputs" in {
   val trf = new TailRecursion
		
    val result = trf.fact(10000000)
   
  assert(true)
  }
  
  it should "evaluate to 120 if argument is 5" in {
  val trf = new TailRecursion
		
    val result = trf.fact(5)
    
    assert(result === 120)
  }
}