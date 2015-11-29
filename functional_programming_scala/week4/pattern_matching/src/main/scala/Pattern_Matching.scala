package fpscala.week4

trait Expr 
case class Number(n: Int) extends Expr
case class Sum(e1: Expr,e2: Expr) extends Expr
//case class Sum(e1: Prod,e2: Expr) extends Expr
//case class Sum(e1: Expr,e2: Prod) extends Expr
case class Var(name: String) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
object Util{
def show(e: Expr) : String = e match {
	case Number(n) => n.toString()
	//case Sum(e1,e2) => show(e1) + " + " + show(e2)
	case Prod(e1,e2) 
	=> {
		(e1,e2) match {
		    case (Sum(ee1,ee2),Sum(ee3,ee4)) => "("+show(e1)+")" + " * " + "("+show(e2)+")"
			case (Sum(ee1,ee2),_) =>"("+show(e1)+")" + " * " + show(e2)
			case (_,Sum(ee1,ee2)) => show(e1) + " * " + "("+show(e2)+")"
			case _ => show(e1) + " * " + show(e2)
		}
	}
	case Var(name) => name
	case Sum(e1,e2) => show(e1) + " + "+show(e2)
}}