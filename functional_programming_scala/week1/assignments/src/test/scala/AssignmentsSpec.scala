import fpscala.week1._
import org.scalatest._


class AssignmentsSpec extends FlatSpec {
	"pascal(0,0) "should " return 1 " in {
		assert(Assignments.pascal(0,0)===1)
	}
	"pascal(2,1) "should " throw an IllegalArgumentException " in {
	intercept[IllegalArgumentException]{
		Assignments.pascal(2,1)
	}
		assert(true)
	}
	"pascal(0,r) "should " return 1 regardless of 'r' " in {
		assert(Assignments.pascal(0,10)===1)
	}
	"pascal(0,1) and pascal(1,1)"should " return 1 " in {
		assert(Assignments.pascal(0,1)===1)
		assert(Assignments.pascal(1,1)===1)
	}
	"pascal(1,2)"should " return 2 " in {
		assert(Assignments.pascal(1,2)===2)
	}
	"pascal(c,c)"should " return 1 " in {
		assert(Assignments.pascal(2,2)===1)
	}
	"pascal(1,3)"should " return 3 " in {
		assert(Assignments.pascal(1,3)===3)
	}
	"pascal(2,4)"should " return 6 " in {
		assert(Assignments.pascal(2,4)===6)
	}
  it should " fail a failing test " in {
    assert(false)
  }
  
}