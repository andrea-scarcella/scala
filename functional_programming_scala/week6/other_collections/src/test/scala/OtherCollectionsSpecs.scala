import fpscala.week5._
import org.scalatest._
import Matchers._
class OtherCollectionsSpecs extends FlatSpec {

    "isPrime " should " return true when applied to 23" in{
		val value= 23
		val result=Util.isPrime(value)
		val expected=true
		assert(result===expected)
	}
	it should "return false when applied to 12" in {
		val value=12
		val result=Util.isPrime(value)
		val expected=false
		assert(result===expected)
	}

	 	
}