package fpscala.week4 

abstract class IntSet {
	def incl(x:Int):IntSet
	def contains(x:Int):Boolean
	def union(other:IntSet):IntSet
}

object Empty extends IntSet {
	def incl(x:Int):IntSet = {new NonEmpty(x,Empty,Empty)}
	def contains(x:Int):Boolean = false
	def union(other:IntSet):IntSet = {
		other//should a new NonEmpty be returned?
	}
	override def toString = { "." }
}
class NonEmpty(elem:Int, left:IntSet, right:IntSet) extends IntSet{
	def incl(x:Int):IntSet= {
		if( x < elem) new NonEmpty(elem, left.incl(x), right)
		else if (x > elem) new NonEmpty(elem, left, right.incl(x)) 
		else this
	}
	def contains(x:Int):Boolean = {
		if (x < elem) left contains x 
		else if (x>elem) right contains x
		else true
	}
	def union(other:IntSet):IntSet= {
		right.union(left.union (other.incl(elem)))
	}
	override def toString = { "{"+left + elem +right+"}" }
}