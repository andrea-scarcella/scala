package fpscala.week1;

class AndOperator {
  def and(arg1: Boolean,arg2: Boolean): Boolean = (arg1,arg2) match {
  case(true,true) => true
  case _ => false
  }
}
