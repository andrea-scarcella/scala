import fpscala.week2._
import org.scalatest._
import scala.math._

class RationalSpec extends FlatSpec {

  "A rational number" should " multiplied by -1 equals its opposite " in {
    val x = new Rational(2,3)
	var result=x.neg
	var expected=new Rational(-2,3)
		
    
    assert(result.numer === expected.numer && result.denom === expected.denom)
	//assert(result.denom === expected.denom)
    
  }
   it should " support subtraction " in {
    val x = new Rational(2,3)
	val y = new Rational(1,3)
	val result=x.sub(y)
	assert(result.numer===3)
	assert(result.denom===9)
	
  }
  
   it should " compute the correct result by repeated subtraction " in {
    val x = new Rational(1,3)
	val y = new Rational(5,7)
	val z = new Rational(3,2)
	val result = x.sub(y).sub(z)
	assert(result.numer=== -79)
	assert(result.denom=== 42)
  }
  
 
  it should " fail a failing test " in {
    assert(false)
  }
  
}