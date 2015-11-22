import fpscala.week1._
import org.scalatest._
import scala.math._

class FixedPointsSpec extends FlatSpec {

  "A definition of sqrt (x) as fixed point of averageDamp of y/x with initial estimate 1" should " approximate 2 when x=4 " in {
    val fp = new FixedPoints
		
    val result = fp.sqrt(4)
    val target=2
    assert(abs(result- target)/result < 0.0001)
    
  }
  it should " fail a failing test " in {
    assert(false)
  }
  
}