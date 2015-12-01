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
	def cp(stackSize:Int, xs: List[Char]):Boolean ={
		if ( xs.isEmpty) stackSize == 0//no open round brackets left on stack
		else 
		if (stackSize < 0) false // too many closed brackets
		else
		if(xs.head == pop)  cp(stackSize-1,xs.tail) //closed bracket, pop an open bracket
		else
		if(xs.head == push) cp(stackSize+1,xs.tail) //open bracket, push on stack
		else		
		cp(stackSize,xs.tail) //other character, stack size not modified
	}
	cp(0,chars)
}
}
