import fpscala.week4._
import org.scalatest._

//import Matchers._
class CovarianceSpec extends FlatSpec {
	"Scala arrays " should " not be covariant" in {
	//This test should not compile :), because scala arrays not covariant
	//Type hierarchy: Empty <: IntSet, NonEmpty <: IntSet
	val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
	//val b: Array[IntSet] = a
	//b(0) = Empty
	//val s: NonEmpty = a(0)
	//type mismatch,Int<:Any but arrays not covariant
	}
	"Since Int<:Any, a variable of type Int " should " be assignable to a variable of type Any " in {
		val a:Int=0
		val b:Any=a
		assert(b === a)
	}
   }