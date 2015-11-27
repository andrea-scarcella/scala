import fpscala.week4._
import fpscala.week3._
import org.scalatest._
import scala.math._
import Matchers._
class ListSpec extends FlatSpec {

  "The n-th element of an empty list " should " throw an IndexOutOfBondsException" in {
	val list= new Nil[Int]
	var result = None:Option[Int]
	intercept[IndexOutOfBoundsException]{
	result=list.nth(3)
	}
   
  }
  it should "not be defined" in {
	val list= new Nil[Int]
	var result = None:Option[Int]
	intercept[IndexOutOfBoundsException]{
	result=list.nth(3)
	}
    assert(result.isDefined === false)
  }
  "The n-th element of a non-empty list " should " throw an IndexOutOfBondsException if n >= list length" in {
	val list=new Cons[Int](0,new Nil[Int])
	var result=1
	intercept[IndexOutOfBoundsException]{
		result=list.nth(64)
	}
	
   }
   it should " not modify the lhs of an assignment" in{
    val list=new Cons[Int](0,new Nil[Int])
	var result=1
	intercept[IndexOutOfBoundsException]{
		result=list.nth(64)
	}
	assert(result  === 1)//not changed
   }
   it should " return the nth element of a list when nth >=0 and nth < list.length" in {
   val list=new Cons[Int](0,new Cons[Int](10,new Nil[Int]))
	val secondElement=list.nth(1)
	val firstElement=list.nth(0)
	assert(secondElement  === 10)//not changed
	assert(firstElement  === 0)//not changed
   }
   "A List Object" should " return an empty list when invoked with no parameters" in {
	val nil=List()
	
	nil shouldBe a [Nil[_]]// use _ because of type erasure
   }
   it should " return a list of length 1 containing n when invoked with n as a parameter" in{
   val list=List(10)
	
	list shouldBe a [Cons[_]]// use _ because of type erasure
	list.head shouldBe 10
   }
   
   it should " return a list of length 2 containing n,m when invoked with n,m as parameters" in{
   val list=List(10,11)
	
	list shouldBe a [Cons[_]]// use _ because of type erasure
	list.head shouldBe 10
	list.tail.head shouldBe 11
   }
   "The prepend operator" should " be covariant in the result type and contravariant in the argument types" in {
   //The added value of this test is that if you get the type of val result wrong it will not compile
   //It is meant as a reminder of what the type of 'f' is rather than a proper unit test.
	def f(xs: List[NonEmpty], x: EmptyClass) = xs prepend x
	val list=new Cons(new NonEmpty(9,Empty,Empty),new Nil[NonEmpty])
	val result:List[IntSet]=f(list,new EmptyClass())
	result shouldBe a [List[_]]
   }
   
   
   }