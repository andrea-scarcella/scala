import fpscala.week4._
import org.scalatest._
import Matchers._
class Pattern_MatchingSpec extends FlatSpec {
	"show(Number(4)) " should " return \"4\" " in {
		val result=Util.show(Number(4))
		assert(result === "4")
	}
}