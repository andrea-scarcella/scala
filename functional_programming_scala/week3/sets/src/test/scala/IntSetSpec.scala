import fpscala.week3._
import org.scalatest._
import scala.math._

class RationalSpec extends FlatSpec {

  "The empty set" should " not contain any element " in {
	val result= Empty.contains(3)
    assert(result===false)
  }
   it  should " include the alement added using incl" in {
	val result= Empty.incl(3).contains(3)
    assert(result===true)
  }
   it  should " be the zero element wrt union operation" in {
	val x = Empty.incl(3)
	val result= Empty.union(x)
    assert(result===x)
  }
  "A non-empty set" should " contain a new element included in it " in {
	val x= Empty.incl(3)
	val y= x.incl(4)
    assert(y.contains(3)===true)
	assert(y.contains(4)===true)
  }
  "The union of two non-empty sets " should " contain the elements of both sets " in {
	val x= Empty.incl(3)
	val y= Empty.incl(4)
	val result=x.union(y)
    assert(result.contains(3)===true)
	assert(result.contains(4)===true)
  }
  it should " compute the union of the following sets correctly {10,20,30} and {1,200,201} " in {
    val x= Empty.incl(10).incl(20).incl(30)
	val y= Empty.incl(1).incl(200).incl(201)
	val result=x.union(y)
	assert(result.contains(1)===true)
	assert(result.contains(10)===true)
	assert(result.contains(20)===true)
	assert(result.contains(30)===true)
	assert(result.contains(200)===true)
	assert(result.contains(201)===true)
  }
  it should " compute the union of partially overlapping sets correctly " in {
     val x= Empty.incl(10).incl(20).incl(30)
	val y= Empty.incl(1).incl(20)
	val result=x.union(y)
	assert(result.contains(1)===true)
	assert(result.contains(10)===true)
	assert(result.contains(20)===true)
	assert(result.contains(30)===true)
  }
   it should " evaluate to a string containing all elements" in {
     val x= Empty.incl(10).incl(20).incl(30)
	val y= Empty.incl(4).incl(20)
	val result=x.union(y).toString()
	
	assert(result.indexOf("10") !== -1)
	assert(result.indexOf("20") !== -1)
	assert(result.indexOf("30") !== -1)
	assert(result.indexOf("4") !== -1)

  }
  
   it should " fail a failing test " in {
    assert(false)
  }
  
}