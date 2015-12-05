import fpscala.week5._
import org.scalatest._
import Matchers._
class HigerOrderFunctionsSpecs extends FlatSpec {

    "squareList " should " return a new list whose elements are the square of the elements of input list" in{
		val xs=List(0,1,2,3)
		val result=Util.squareList(xs)
		val expected=List(0,1,4,9)
		assert(result===expected)
	}
	it should "return empty when input list is empty" in {
		val xs= List()
		val result= Util.squareList(xs)
		val expected=List()
		assert(expected===result)
	}
	
	"squareListMap " should " return a new list whose elements are the square of the elements of input list" in{
		val xs=List(0,1,2,3)
		val result=Util.squareListMap(xs)
		val expected=List(0,1,4,9)
		assert(result===expected)
	}
	it should "return empty when input list is empty" in {
		val xs= List()
		val result= Util.squareListMap(xs)
		val expected=List()
		assert(expected===result)
	}
	"pack " should " return empty on an empty list" in{
		val xs=List()
		val result=Util.pack(xs)
		val expected=List()
		assert(result===expected)
	}
	it should " return List(List(\"a\",\"a\",\"a\"),List(\"b\"),List(\"c\",\"c\"),List(\"a\")) when applied to List (\"a\",\"a\",\"a\",\"b\",\"c\",\"c\",\"a\") " in {
		val xs= List ("a","a","a","b","c","c","a") 
		val result= Util.pack(xs)
		val expected=List(List("a","a","a"),List("b"),List("c","c"),List("a")) 
		assert(expected===result)
	}
	
	"encode " should " return an empty list when applied to an empty list" in{
		val xs=List()
		val result=Util.encode(xs)
		val expected=List()
		assert(result===expected)
	}
	it should "return List((\"a\", 3), (\"b\", 1), (\"c\", 2), (\"a\", 1)) when applied to List(\"a\", \"a\", \"a\", \"b\", \"c\", \"c\", \"a\")" in {
		val xs= List("a", "a", "a", "b", "c", "c", "a")
		val result= Util.encode(xs)
		val expected=List(("a", 3), ("b", 1), ("c", 2), ("a", 1))
		assert(expected===result)
	}
}