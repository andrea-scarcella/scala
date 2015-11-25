package fpscala.week4 
trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
	def nth(n:Int):T
	def length:Int
}

class Cons[T](val head: T,val tail:List[T]) extends List[T]{
def isEmpty = false
//def head = head
//def tail = tail
def nth(n:Int)= if (n==0) head else tail.nth(n-1) //if (n<0) throw new IndexOutOfBoundsException("nth") //is redundant, covered by trying to return the head of an empty list :)
def length:Int = 1 + tail.length
}

class Nil[T] extends List[T]{
def isEmpty = true
def head:Nothing = throw new NoSuchElementException("head")
def tail:Nothing = throw new NoSuchElementException("tail") 
def length:Int = 0
def nth(n:Int):Nothing =  throw new IndexOutOfBoundsException("nth") 

}

object List{
def apply [T]()= new Nil[T]
def apply[T](n:T)=new Cons[T](n,new Nil[T])
def apply[T](n:T,m:T)=new Cons[T](n,new Cons[T](m,new Nil[T]))
}

