import fpscala.week1._
import org.scalatest._
import scala.math._

class NewtonSqrtSpec extends FlatSpec {

  "A Newton method-based Sqrt operator" should "approximate sqrt(2)" in {
    val sqrtop = new NewtonSqrt
	val x = 2
	
    val result = sqrtop.sqrt(x)
    
    assert(abs(1 - 1.4142/result)<0.0001)
    
  }

  it should "approximate large inputs" in {
   val sqrtop = new NewtonSqrt
	val x = 1e20
	val expected =1e10
    val result = sqrtop.sqrt(x)
    
    assert(abs(1-expected/result)<0.0001)//tests termination
  }
  
  it should "approximate small inputs" in {
   val sqrtop = new NewtonSqrt
	val x = 1e-20
	val expected =1e-10
    val result = sqrtop.sqrt(x)
    
    assert(abs(1-expected/result)<0.0001)//tests termination
  }
}