package fpscala.week5
import scala.collection._
import scala.math._

object Util {
	def scalarProduct(xs: List[Double],ys: List[Double]): Double ={
		(for {
			pair <- xs zip ys
		} yield (pair._1 * pair._2)).sum
		//also correct but too complex, sum is enough
		//.foldLeft(0.0){ (total,n)=> total + n}
	}
}