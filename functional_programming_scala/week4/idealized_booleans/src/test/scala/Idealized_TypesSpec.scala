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
	"Zero" should "not have a predecessor" in {
		intercept[Exception]{
		Zero.predecessor
		}
	}
	it should " return True for calls to isZero" in {
		assert (Zero.isZero === True)
	}
	it should " be neutral wrt addition (lhs, rhs zero)" in {
		assert (Zero + Zero === Zero)
	}
	it should " be neutral wrt subtraction if rhs is zero" in {
		assert(Zero - Zero === Zero)
	}
	it should " have a non-zero successor " in {
		assert(Zero.successor !== Zero)
	}
	"NonZero" should " have a non-zero successor " in {
		assert(Zero.successor.successor !== Zero)
	}
	"Zero.successor " should " have a Zero predecessor (successor and predecessor are dual operations) " in {
		assert(Zero.successor.predecessor === Zero)
	}
	"Zero.successor.successor.predecessor " should " be Zero.successor " in {
		val lh=Zero.successor.successor.predecessor
		var rh=Zero.successor	
		assert(lh.predecessor === rh.predecessor && lh.predecessor === Zero)
	}
	"NonZero (Zero.successor) + Zero " should " equal NonZero" in {
		val nz=Zero.successor
		val result=nz + Zero
		assert(result === nz)
	}
	"NonZero - NonZero " should " equal Zero" in {
		assert((Zero.successor - Zero.successor) ===Zero)
	}
	"NonZero - NonZero.predecessor " should " equal Zero.successor" in {
	val v1=Zero.successor
		assert((v1.successor - Zero.successor) ===v1)
	}
	
   }