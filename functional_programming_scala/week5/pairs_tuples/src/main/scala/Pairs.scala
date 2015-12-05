package fpscala.week5
import scala.collection._
import scala.math._

object Util {
	def merge(xs: List[Int],ys: List[Int]): List[Int] = (xs,ys) match {
		case (Nil,List()) => List()
		case (x1::xs1,List()) => xs
		case (List(),y1::ys1) => ys
		case (x1::xs1,y1::ys1) => {
			if(x1 < y1){ x1 :: merge(xs1,ys)}else {
				y1::merge(xs,ys1)
			}
		}
}
}