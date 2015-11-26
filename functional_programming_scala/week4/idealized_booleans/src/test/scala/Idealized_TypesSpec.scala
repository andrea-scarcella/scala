import fpscala.week4._
//import idealized.scala
import org.scalatest._

//import Matchers._
class Idealized_TypesSpec extends FlatSpec {
	"False " should " be less than True" in {
		
		val result = False < True
		assert (result === True)
	}
	it should " not be less than False" in {
		
		val result = False < False
		assert (result === False)
	}
	"True" should " not be less than False" in {
		
		val result = True < False
		assert (result === False)
	}
	it should " not be less than True" in {
		
		val result = True < True
		assert (result === False)
	}
   }