package fpscala.week6
import scala.collection._
import scala.math._

object Util {
	def isSafe(col: Int, queens: List[Int]): Boolean= {
	(queens.filter( k=> k  == col).length == 0 ) &&
	(for {
		qrow <- 0 until queens.length //current queen row
		q <- qrow + 1 to queens.length //rows from next to last
		if(
		q == queens.length && (
			queens(qrow)+ (q - qrow) == col 
			||
			queens(qrow) - (q - qrow) == col 
			)
		)
	}yield (false)).foldLeft(true)((a,b)=>(a && b))
	
	}
}