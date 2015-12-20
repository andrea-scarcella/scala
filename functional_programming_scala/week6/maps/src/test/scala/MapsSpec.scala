import fpscala.week6._
import org.scalatest._
import Matchers._
class MapsSpecs extends FlatSpec {

    "Poly.+ " should " sum coefficients of terms with same exponent" in{
		val p1=new Poly(0->3.0);
		val p2=new Poly(0->6.0);
		val expected=new Poly(0->9.0);
		val actual = p1 + p2;
		assert(expected.terms === actual.terms);
	}
	it should " not sum coefficients of terms with different exponent" in{
		val p1=new Poly(0->3.0);
		val p2=new Poly(1->6.0);
		val expected=new Poly(0->3.0,1 -> 6.0);
		val actual = p1 + p2;
		assert(expected.terms === actual.terms);
	}
}