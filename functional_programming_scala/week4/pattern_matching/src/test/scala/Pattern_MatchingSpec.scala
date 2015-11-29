import fpscala.week4._
import org.scalatest._
import Matchers._
class Pattern_MatchingSpec extends FlatSpec {
	"show(Number(4)) " should " return \"4\" " in {
		val result=Util.show(Number(4))
		assert(result === "4")
	}
	"show(Sum(Number(4),Number(5)) " should " return \"4 + 5\" " in {
		val result=Util.show(Sum(Number(4),Number(5)))
		assert(result === "4 + 5")
	}
	"show(Var(\"x\")) " should " return \"x\" " in {
		val result=Util.show(Var("x"))
		assert(result === "x")
	}
	"show(Prod(Number(4),Number(5)) " should " return \"4 * 5\" " in {
		val result=Util.show(Prod(Number(4),Number(5)))
		assert(result === "4 * 5")
	}
	"show(Sum(Prod(Number(4),Number(5)),Sum(Number(4),Number(5)))) " should " return \"(4 * 5) + 4 + 5\" " in {
		val result=Util.show(Sum(Prod(Number(4),Number(5)),Sum(Number(4),Number(5))))
		assert(result === "4 * 5 + 4 + 5")
	}
	
	"show(Sum(Prod(Number(2),Var(\"x\")),Var(\"y\"))) " should " return \"2 * x + y\" " in {
		val result=Util.show(Sum(Prod(Number(2),Var("x")),Var("y")))
		assert(result === "2 * x + y")
	}
	
	"show(Prod(Sum(Number(2),Var(\"x\")),Var(\"y\"))) " should " return \"y + 2 * x\" " in {
		val result=Util.show(Prod(Sum(Number(2),Var("x")),Var("y")))
		assert(result === "(2 + x) * y")
	}
	//ko?
	"show(Prod(Sum(Number(2),Var(\"x\")),Sum(Var(\"y\"),Number(2)))) " should " return \"(2 + x) * (y + 2)\" " in {
		val result=Util.show(Prod(Sum(Number(2),Var("x")),Sum(Var("y"),Number(2))))
		assert(result === "(2 + x) * (y + 2)")
	}
}