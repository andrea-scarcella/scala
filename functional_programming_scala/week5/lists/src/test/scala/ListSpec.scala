import fpscala.week5._
import org.scalatest._
import Matchers._
class ListSpec extends FlatSpec {

    "List.init" should " throw an exception when applied to List()" in{
		val list=List()
		intercept[Error]{
		Util.init(list)
		}
		assert(true)
	}
	it  should " return an empty list when applied to List(x)" in{
		val list=List(1)
		
		val result=Util.init(list)
		
		assert(result===List())
	}
	it  should " return all elements except for the last when applied to List(0,1,2,3)" in{
		val list=List(0,1,2,3)
		val expected=List(0,1,2)
		val result=Util.init(list)
		
		assert(result===expected)
	}
	"removeAt "  should " return a copy of the input list without the k-th element" in{
		val list=List(0,1,2,3)
		val expected=List(0,2,3)
		val result=Util.removeAt(1,list)
		
		assert(result===expected)
	}
	it  should " return a copy of the input list when k out of bounds" in{
		val list=List(0,1,2,3)
		val expected=List(0,1,2,3)
		val result=Util.removeAt(10,list)
		
		assert(result===expected)
	}
	"concat " should " return a copy of ys when applied to List(),ys" in{
		val list=List(0,1,2,3)
		val expected=List(0,1,2,3)
		val result=Util.concat(List(),list)
		
		assert(result===expected)
	}
	it should " return a copy of xs :: ys when applied to xs ,ys" in{
		val xs=List(0,1,2,3)
		val ys=List(4,5,6,7)
		val expected=List(0,1,2,3,4,5,6,7)
		val result=Util.concat(xs,ys)
		
		assert(result===expected)
	}
	"reverse " should " return List() when applied to List()" in{
		val list=List()
		val expected=List()
		val result=Util.reverse(list)
		
		assert(result===expected)
	}
	it should " return List(,2,1,0) when applied to List(0,1,2,3)" in{
		val list=List(0,1,2,3)
		val expected=List(3,2,1,0)
		val result=Util.reverse(list)
		
		assert(result===expected)
	}
   }