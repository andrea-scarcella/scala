import fpscala.week4._
import org.scalatest._
import Matchers._
class Pattern_MatchingSpec extends FlatSpec {
	"isort(List(3,2,1)) " should " return List(1,2,3) " in {
	val list=List(3,2,1)
	val result=list_quiz.isort(list)
	val expected=List(1,2,3)
	assert(result === expected)
	}
	"isort(List(2,3,1)) " should " return List(1,2,3) " in {
	val list=List(2,3,1)
	val result=list_quiz.isort(list)
	val expected=List(1,2,3)
	assert(result === expected)
	}
	"isort(List(1,2,3)) " should " return List(1,2,3) " in {
	val list=List(1,2,3)
	val result=list_quiz.isort(list)
	val expected=List(1,2,3)
	assert(result === expected)
	}
	"isort(List(3,1,3)) " should " return List(1,3,3) " in {
	val list=List(3,1,3)
	val result=list_quiz.isort(list)
	val expected=List(1,3,3)
	assert(result === expected)
	}
}