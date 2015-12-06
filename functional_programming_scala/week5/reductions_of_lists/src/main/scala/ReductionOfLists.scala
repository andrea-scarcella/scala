package fpscala.week5
import scala.collection._
import scala.math._

object Util {
	def mapFun[T,U](xs: List[T], f: T => U): List[U] = {
		(xs foldRight List[U]())(f(_)::_)
	}
	def lengthFun[T](xs: List[T]): Int ={
		(xs foldRight 0)((h,k)=>1+k)//fold operation defined in fn body, thus parameters inferred from fn signature
	}
}