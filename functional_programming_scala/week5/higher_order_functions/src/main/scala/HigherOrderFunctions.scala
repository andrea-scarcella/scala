package fpscala.week5
import scala.collection._
import scala.math._

object Util {
	def squareList(xs: List[Int]): List[Int] = (xs) match {
		case (List()) => List()
		case y :: ys => {
			y * y :: squareList(ys)
		}
	}
	def squareListMap(xs: List[Int]):List[Int]={
		xs map (x => x * x )
	}
	def pack[T](xs: List[T]):List[List[T]]= xs match {
	case List() => List()
	case y :: ys => 
		val (first, rest) = xs span (x=> x == y)
		first :: pack(rest)
		//also correct but more verbose
		//List(xs.takeWhile(x=> x == y)) ++ pack(xs.dropWhile(x=> x == y))
	}
	def encode[T](xs: List[T]): List[Tuple2[T,Int]] =  {
		//case List() => List()
		// case y :: ys => 
			// val (first,rest) = xs span (x => x == y)
			// List((first.head,first.length)) ++ encode(rest)
		pack(xs).map (ys => (ys.head,ys.length))
	}
}