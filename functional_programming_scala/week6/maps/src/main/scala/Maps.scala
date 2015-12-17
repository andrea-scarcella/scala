package fpscala.week6
//immutable maps available by default
//import scala.collection._
import scala.math._

//object Util {
	class Poly(terms0: Map[Int,Double]){
		def this(bindings: (Int,Double)*)=this(bindings.toMap)
		val terms=terms0.withDefaultValue(0.0)
		def + (other: Poly) = new Poly(
		((other.terms foldLeft(terms))(addTerm))//(inputSeq.foldLeft (emptySeq))(fn)
		)
		def addTerm(terms: Map[Int, Double], term: (Int, Double)) =  {
		terms + (term._1 -> (terms( term._1 ) + term._2))
		}
	}
	
//}
