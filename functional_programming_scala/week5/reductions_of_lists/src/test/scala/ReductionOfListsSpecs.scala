import fpscala.week5._
import org.scalatest._
import Matchers._
class HigerOrderFunctionsSpecs extends FlatSpec {

    "mapFun " should " apply a function to all elements of a list" in{
		val xs=List(0,1,2,3)
		//type inference flows fromleft to right _across_ parameter groups!
		//http://stackoverflow.com/a/13115193/741695
		//http://stackoverflow.com/a/14616668/741695 (with link to a possible xplanation)
		val result=Util.mapFun(xs,((x:Int) => x*x))
		val expected=List(0,1,4,9)
		assert(result===expected)
	}
	it should "return empty when input list is empty" in {
		val xs= List()
		val result= Util.mapFun(xs,((x:Int) => x*x))
		val expected=List()
		assert(expected===result)
	}

	 "lengthFun " should " return the length of a list (4, when applied to List(0,1,2,3) )" in{
		val xs=List(0,1,2,3)
		//type inference flows fromleft to right _across_ parameter groups!
		//http://stackoverflow.com/a/13115193/741695
		//http://stackoverflow.com/a/14616668/741695 (with link to a possible xplanation)
		val result=Util.lengthFun(xs)
		val expected=4
		assert(result===expected)
	}
	it should "return 0 when input list is empty" in {
		val xs= List()
		val result= Util.lengthFun(xs)
		val expected=0
		assert(expected===result)
	}
	
}