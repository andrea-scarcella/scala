package fpscala.week1;

class OrOperator{
def or(arg1:Boolean,arg2:Boolean):Boolean = (arg1,arg2) match{
	case(false,false)=>false
	case(arg1,arg2)=>true
}
}