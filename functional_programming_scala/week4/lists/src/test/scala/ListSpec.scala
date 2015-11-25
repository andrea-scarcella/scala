import fpscala.week4._
import org.scalatest._
import scala.math._
import scala._
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
   }