package fpscala.week4

trait Expr 
case class Number(n: Int) extends Expr

object Util{
def show(e: Expr) : String = e match {
	case Number(n) =>n.toString()
}}