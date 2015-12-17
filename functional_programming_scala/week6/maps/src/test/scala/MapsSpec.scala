import fpscala.week6._
import org.scalatest._
import Matchers._
class MapsSpecs extends FlatSpec {

    "Poly.+ " should " sum coefficients of terms with same power" in{
		val p1=new Poly(0->3.0);
		val p2=new Poly(0->6.0);
		val expected=new Poly(0->9.0);
		val actual = p1 + p2;
		assert(expected.terms === actual.terms);
	}
}