package fpscala.week4 
//package idealized.scala
abstract class Boolean {
	def ifThenElse[T](t: =>T,e: => T): T
	def leq (x:Boolean) = ifThenElse(x,True)//less or equal than
	def < (x:Boolean) = ifThenElse(False,x)//less than
}
object True extends Boolean{
	def ifThenElse[T](t:  =>T,e: => T):T=t
}
object False extends Boolean{
	def ifThenElse[T](t:  =>T,e: => T):T=e
}

