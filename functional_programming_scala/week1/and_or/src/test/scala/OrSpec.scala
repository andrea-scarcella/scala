import fpscala.week1._
import org.scalatest._

class OrSpec extends FlatSpec {

  "An Or operator" should "evaluate to true if both arguments are true" in {
    val orop = new OrOperator
	val arg1 = true
	val arg2 = true
    val result = orop.or(arg1,arg2)
    
    assert(result === true)
    
  }

  it should "evaluate to true if the first argument is true" in {
   val orop = new OrOperator
	val arg1 = true
	val arg2 = false
    val result = orop.or(arg1,arg2)
    
    assert(result === true)
  }
  it should "evaluate to true if the second argument is true" in {
   val orop = new OrOperator
	val arg1 = false
	val arg2 = true
    val result = orop.or(arg1,arg2)
    
    assert(result === true)
  }
  
   it should "evaluate to false if both arguments are false" in {
   val orop = new OrOperator
	val arg1 = false
	val arg2 = false
    val result = orop.or(arg1,arg2)
    
    assert(result === false)
  }
}