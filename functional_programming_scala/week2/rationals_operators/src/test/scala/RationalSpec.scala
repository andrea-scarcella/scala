import fpscala.week2._
import org.scalatest._
import scala.math._

class RationalSpec extends FlatSpec {

  "A rational number" should " multiplied by -1 equals its opposite " in {
    val x = new Rational(2,3)
	var result= - x
	var expected=new Rational(-2,3)
		
    
    assert(result.numer === expected.numer && result.denom === expected.denom)
	//assert(result.denom === expected.denom)
    
  }
   "The - operator on two rational numbers" should " compute their difference " in {
    val x = new Rational(2,3)
	val y = new Rational(1,3)
	val result=x - y
	assert(result.numer===1)
	assert(result.denom===3)
	
  }
  
  it  should " compute the correct result by repeated subtraction " in {
    val x = new Rational(1,3)
	val y = new Rational(5,7)
	val z = new Rational(3,2)
	val result = x - y - z
	assert(result.numer=== -79)
	assert(result.denom=== 42)
  }
  
    "The less-than operator on two rational numbers " should " return true if the first number is less than the second " in {
     val x = new Rational(1,3)
	 val y = new Rational(5,7)
	 val result= x < y
	 assert (result === true)
  }
  "The + operator on two rational numbers " should " compute their sum" in {
	val x = new Rational(1,3)
	val y = new Rational(5,7)
	val result = x + y
	assert (result.numer === 22 && result.denom === 21)
  }
 
  it should " fail a failing test " in {
    assert(false)
  }
  
}