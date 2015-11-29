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
}
