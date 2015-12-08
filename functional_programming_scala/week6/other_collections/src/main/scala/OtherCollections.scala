package fpscala.week5
import scala.collection._
import scala.math._

object Util {
	def isPrime(n: Int): Boolean ={
		//2 .. n-1
		(2 until n) forall ( el=> n % el !=0)
	}
}