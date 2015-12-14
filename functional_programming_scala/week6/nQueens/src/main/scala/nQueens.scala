package fpscala.week6
import scala.collection._
import scala.math._

object Util {
	def isSafe(col: Int, queens: List[Int]): Boolean= {
		val row=queens.length
		val queensWithRows= (row - 1 to 0 by -1) zip queens
		//choosen (row,colum) different from any previous columns 
		//and not in check with any previous queen (i.e. not lying on same diagonal, i.e. dx!=dy)
		queensWithRows forall{ case (r,c) => c != col && math.abs(col-c)!= row -r}
	}
}