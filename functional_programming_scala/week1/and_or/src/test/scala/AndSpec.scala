import fpscala.week1._
import org.scalatest._

class AndSpec extends FlatSpec {

  "An And operator" should "evaluate to true if both arguments are true" in {
    val andop = new AndOperator
	val arg1 = true
	val arg2=true
    val result = andop.and(arg1,arg2)
    
    assert(result === true)
    
  }

  it should "evaluate to false if the first argument is false" in {
   val andop = new AndOperator
	val arg1 = false
	val arg2=true
    val result = andop.and(arg1,arg2)
    
    assert(result === false)
  }
  it should "evaluate to false if the second argument is false" in {
   val andop = new AndOperator
	val arg1 = true
	val arg2 = false
    val result = andop.and(arg1,arg2)
    
    assert(result === false)
  }
  
   it should "evaluate to false both arguments are false" in {
   val andop = new AndOperator
	val arg1 = false
	val arg2 = false
    val result = andop.and(arg1,arg2)
    
    assert(result === false)
  }
}