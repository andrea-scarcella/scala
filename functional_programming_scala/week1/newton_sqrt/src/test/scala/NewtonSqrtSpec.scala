import fpscala.week1._
import org.scalatest._
import scala.math._

class NewtonSqrtSpec extends FlatSpec {

  "A Newton method-based Sqrt operator" should "approximate sqrt(2)" in {
    val sqrtop = new NewtonSqrt
	val x = 2
	
    val result = sqrtop.sqrt(x)
    
    assert(abs(result - 1.4142)<0.0001)
    
  }

  it should "approximate large inputs" in {
   val sqrtop = new NewtonSqrt
	val x = 1e6
	
    val result = sqrtop.sqrt(x)
    
    assert(abs(result-1000)<0.0001)//tests termination
  }
  
  it should "approximate small inputs" in {
   val sqrtop = new NewtonSqrt
	val x = 1e-6
	val expected =1e-3
    val result = sqrtop.sqrt(x)
    
    assert(abs(result-expected)<0.0001)//tests termination
  }
}