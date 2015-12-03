import fpscala.week5._
import org.scalatest._
import Matchers._
class PairsSpec extends FlatSpec {

    "merge " should " return an empty list when both arguments are empty" in{
		val xs=List()
		val ys=List()
		val result=Util.merge(xs,ys)
		val expected=List()
		assert(result===expected)
	}
	it should " return xs if ys is empty" in{
		val xs=List(1)
		val ys=List()
		val result=Util.merge(xs,ys)
		val expected=List(1)
		assert(result===expected)
	}
	it should " return ys if xs is empty" in{
		val xs=List()
		val ys=List(1)
		val result=Util.merge(xs,ys)
		val expected=List(1)
		assert(result===expected)
	}
	
	it should " return List(0,1,2,3,4,5) if xs=List(1,3,5) and ys=List(0,2,4)" in{
		val xs=List(1,3,5)
		val ys=List(0,2,4)
		val result=Util.merge(xs,ys)
		val expected=List(0,1,2,3,4,5)
		assert(result===expected)
	}
	it should " return List(0,1,2,3,4,5) if xs=List(1,2,3) and ys=List(0,4,5)" in{
		val xs=List(1,2,3)
		val ys=List(0,4,5)
		val result=Util.merge(xs,ys)
		val expected=List(0,1,2,3,4,5)
		assert(result===expected)
	}
	
   }