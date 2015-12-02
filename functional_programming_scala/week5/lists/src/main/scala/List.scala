package fpscala.week5
import scala.collection._

object Util {
def init[T](xs: List[T]): List[T] = xs match {
	case List() => throw new Error("init of empty list")
	case List(x) => List[T]()
	//case y :: ys =>List(y) ++ init(ys)
	case y :: ys =>y :: init(ys)
}

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match{
	case List() => ys
	case z :: zs => z :: concat(zs,ys)
}

def reverse[T](xs: List[T]): List[T] = xs match {
	case List() => xs
	case y :: ys => reverse(ys) ++ List(y)
}
def removeAt[T](n: Int, xs:List[T]): List[T]= xs match {
	case List() =>xs
	case y :: ys =>{
		if(n < 0 || n > xs.length) xs
		else{
			if(n==0) ys
			else y :: removeAt(n-1,ys)
		}
	}
}
def flatten(xs: List[Any]):List[Any]={
	def flatten_el(z:Any):List[Any] = z match {
		case List()=> List()
		case r:List[Any] => flatten_el(r.head) ++ flatten_el(r.tail) // ++ concatenates lists
		case k:Any => List(k) 
	}
	flatten_el(xs)
	
	}
}