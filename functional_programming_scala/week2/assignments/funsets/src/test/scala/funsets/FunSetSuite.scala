package funsets

import org.scalatest.FunSuite


import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  // test("string take") {
  //   val message = "hello, world"
  //   assert(message.take(5) == "hello")
  // }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  // test("adding ints") {
  //   assert(1 + 2 === 3)
  // }


  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
	val s1_1=singletonSet(1)
	val slb=singletonSet(-1000)
	val sub=singletonSet(1000)
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("union contains all elements of each set") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }
  test("intersection contains elements belonging to both sets"){
	  new TestSets {
		  val s = intersect(s1, s1_1)
		  assert(contains(s, 1), "Intersect 1")
		  assert(!contains(s, 3), "Intersect 3")
		}
  }
 test("Forall returns true iff all set elements of s1 satisfy a property 'p' "){
	  new TestSets {
		  val s = forall(s1, x=> x == 1)
		  assert(s, "Forall 1")
		  
		}
  }
test("Forall returns false iff at least one element of s does not satisfy a property 'p' "){
	  new TestSets {
		  val s =union(s1,s2)
		  val r = forall(s, x=> x == 1)
		  assert(!r, "Forall 1!=2")		  
		}
  }
test("Forall returns false iff an element of s that is a lower bound for forall does not satisfy a property 'p' "){
	  new TestSets {
		  val s =union(slb,s1)
		  val r = forall(s, x=> x == 1)
		  assert(!r, "Forall -1000!=1")		  
		}
  }
 
 test("Forall returns false iff an element of s that is an upper bound for forall does not satisfy a property 'p' "){
	  new TestSets {
		  val s =union(sub,s1)
		  val r = forall(s, x=> x == 1)
		  assert(!r, "Forall 1000!=1")		  
		}
  }
test("Forall returns true iff an element in s but not in range (>bound) does not satisfy a property 'p' "){
	  new TestSets {
		  val s =union(singletonSet(1001),s1)
		  val r = forall(s, x=> x == 1)
		  assert(r, "Forall 1001!=1")		  
		}
  }
test("Forall returns true iff an element in s but not in range (<-bound) does not satisfy a property 'p' "){
	  new TestSets {
		  val s =union(singletonSet(-1001),s1)
		  val r = forall(s, x=> x == 1)
		  assert(r, "Forall -1001!=1")		  
		}
  }
test("Exists returns true iff at least one element of s satisfies a property 'p' "){
	  new TestSets {
		  val s =union(union(s2,s3),s1)
		  val r = exists(s, x=> x == 1)
		  assert(r, "exists 1")		  
		}
  }
test("Exists returns false iff at no element of s satisfies a property 'p'  "){
	  new TestSets {
		  val s =union(union(s2,s3),s1)
		  val r = exists(s, x=> x == 1000)
		  assert(!r, "exists 1000")		  
		}
  }
test("Exists returns false iff no element of singletonSet(-bond)  satisfies property 'p'  "){
	  new TestSets {
		  val s =slb
		  val r = exists(s, x=> x == 1000)
		  assert(!r, "slb exists 1000")		  
		}
  }
test("Exists returns false iff no element of singletonSet(bond)  satisfies property 'p'  "){
	  new TestSets {
		  val s =sub
		  val r = exists(s, x=> x == -1000)
		  assert(!r, "sub exists -1000")		  
		}
  }


test("Exists returns true iff at least one element of singletonSet(-bond)  satisfies property 'p'  "){
	  new TestSets {
		  val s =slb
		  val r = exists(s, x=> x == -1000)
		  assert(r, "slb exists -1000")		  
		}
  }
test("Exists returns true iff at least one element of singletonSet(bond)  satisfies property 'p'  "){
	  new TestSets {
		  val s =sub
		  val r = exists(s, x=> x == 1000)
		  assert(r, "sub exists 1000")		  
		}
  }
  
test("Map(s,f) where s={e1,..en} returns a set f(s)={f(e1),..,f(en)}"){
	  new TestSets {
		  val s= union(s1,s2)
		  val fs = map(s, x=> 2*x)
		  assert(contains(fs,2), "map f(s1)")
		  assert(contains(fs,4), "map f(s1)")
		  assert(!contains(fs,1), "map f(s1)")
		}
  }
test("Map(s,f) where s=empty returns the empty set"){
	  new TestSets {
		  val s= (x: Int) => false
		  val fs = map(s, x=> 2*x)
		  assert(forall(fs,x=>false), "map f(empty)")

		}
  }
}
