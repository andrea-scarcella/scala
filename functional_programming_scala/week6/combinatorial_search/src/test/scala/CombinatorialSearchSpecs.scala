import fpscala.week5._
import org.scalatest._
import Matchers._
class CombinatorialSearchSpecs extends FlatSpec {

    "scalarProduct " should " return 14 when applied to xs=ys=List(1.0,2,3)" in{
		val xs= List(1.0,2,3)
		val ys= List(1.0,2,3)
		val result=Util.scalarProduct(xs,ys)
		val expected=14
		assert(result===expected)
	}
	it should "return 0 when applied to xs=ys=List()" in {
		val xs= List()
		val ys= List()
		val result=Util.scalarProduct(xs,ys)
		val expected=0.0
		assert(result===expected)
	}

	 it should "return 0 when applied to xs=List() and ys=List(1.0,2,3)" in {
		val xs= List()
		val ys= List(1.0,2,3)
		val result=Util.scalarProduct(xs,ys)
		val expected=0.0
		assert(result===expected)
	}
 it should "return 0 when applied to xs=List(1.0,2,3) and ys=List()" in {
		val xs= List(1.0,2,3)
		val ys= List()
		val result=Util.scalarProduct(xs,ys)
		val expected=0.0
		assert(result===expected)
	}	
}