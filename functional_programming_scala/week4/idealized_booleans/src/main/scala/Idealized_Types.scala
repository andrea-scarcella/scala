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

abstract class Nat {
	def isZero: Boolean
	def predecessor: Nat
	def successor: Nat
	def + (that: Nat): Nat
	def - (that: Nat): Nat
}

object Zero extends Nat{
	def isZero: Boolean= True
	def predecessor: Nat = throw new Exception()
	def successor: Nat =new NonZero(Zero)
	def + (that: Nat): Nat = that
	def - (that: Nat): Nat = if (that == Zero) Zero else throw new Exception()
}

class NonZero(pred:Nat) extends Nat{
	def isZero: Boolean=False
	def predecessor: Nat=pred
	def successor: Nat=new NonZero(this)
	def + (that: Nat): Nat= new NonZero(pred + that)
	def - (that: Nat): Nat=if (that.isZero==True)this else pred - that.predecessor
}