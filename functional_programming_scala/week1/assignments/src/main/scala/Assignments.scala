package fpscala.week1
import math.abs
object Assignments{
def pascal(c: Int, r: Int):Int={
	if(c>r) throw new IllegalArgumentException(" c > r")
	if (c == 0) 1 else
	if (r<=1) 1 else
	if (c==r) 1 else
	pascal(c-1,r-1)+pascal(c,r-1)
}
def balance(chars: List[Char]): Boolean={
	
	val push='('
	val pop=')'
	def cp(top:Int, xs: List[Char]):Boolean ={
		if ( xs.isEmpty) top == 0
		else 
		if(xs.head == pop) cp(top-1,xs.tail)
		else
		if(xs.head == push && top >=0 )cp(top+1,xs.tail) 
		else		
		cp(top,xs.tail)		
	}
	cp(0,chars)
}
}
