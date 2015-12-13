import fpscala.week6._
import org.scalatest._
import Matchers._
class CombinatorialSearchSpecs extends FlatSpec {

    "isSafe " should " return false when applied to col=0, queens=List(0,2,4)" in{
		val col= 0
		val queens= List(0,2,4)//row 0,col 0; row 1 col 2; row 3 col 4
		val result=Util.isSafe(col,queens)
		val expected=false
		assert(result===expected)
	}
	it should " return true when applied to col=1, queens=List(0,2,4)" in{
		val col= 1
		val queens= List(0,2,4)
		val result=Util.isSafe(col,queens)
		val expected=true
		assert(result===expected)
	}
	it should " return false when applied to col=5, queens=List(0,2,4)" in{
		val col= 5
		val queens= List(0,2,4)
		val result=Util.isSafe(col,queens)
		val expected=false
		assert(result===expected)
	}
	it should " return false when applied to col=3, queens=List(0,2,4)" in{
		val col= 3
		val queens= List(0,2,4)
		val result=Util.isSafe(col,queens)
		val expected=false
		assert(result===expected)
	}
	it should " return false when applied to col=1, queens=List(0,2)" in{
		val col= 1
		val queens= List(0,2)
		val result=Util.isSafe(col,queens)
		val expected=false
		assert(result===expected)
	}
	
	
	}