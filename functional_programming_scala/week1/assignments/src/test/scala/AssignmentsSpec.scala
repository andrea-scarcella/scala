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
  "balance " should " return true when applied to empty list " in {
    val result=Assignments.balance(List())
	assert(result===true)
  }
  it should " return false when applied to an unbalanced list such as '())(' " in {
    val result=Assignments.balance("())(".toList)
	assert(result===false)
  }
   it should " return false when applied to an unbalanced list such as ':-)' " in {
    val result=Assignments.balance(":-)".toList)
	assert(result===false)
  }
   it should " return false when applied to an unbalanced list such as '((:-)' " in {
    val result=Assignments.balance("((:-)".toList)
	assert(result===false)
  }
   "countChange " should " return 3 when applied to 4,[1,2]" in {
    val money=4
	val denoms=List(1,2)
    val result=Assignments.countChange(money,denoms)
	assert(result===3)
  }
  it should " return 0 when applied to 3,[4]" in {
    val money=3
	val denoms=List(4)
    val result=Assignments.countChange(money,denoms)
	assert(result===0)
  }
   it should " return 0 when applied to 3,[]" in {
    val money=3
	val denoms=List()
    val result=Assignments.countChange(money,denoms)
	assert(result===0)
  }
   it should " return 5 when applied to 4,[1,2,3,4]" in {
    val money=4
	val denoms=List(1,2,3,4)
    val result=Assignments.countChange(money,denoms)
	assert(result===5)
  }
   it should " return 0 when applied to 0,[1,2,3,4]" in {
    val money=0
	val denoms=List(1,2,3,4)
    val result=Assignments.countChange(money,denoms)
	assert(result===0)
  }
   it should " return 1 when applied to 1,[1,2,3,4]" in {
    val money=1
	val denoms=List(1,2,3,4)
    val result=Assignments.countChange(money,denoms)
	assert(result===1)
  }
}