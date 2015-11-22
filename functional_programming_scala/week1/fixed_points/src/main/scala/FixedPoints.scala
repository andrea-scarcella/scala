package fpscala.week1
import math.abs
class FixedPoints  {
	val tolerance=0.0001
	 def averageDamp(f:Double => Double)(x:Double) = (x +f(x))/2
	 def isCloseEnough(x:Double,y:Double) = abs((x-y)/x)/x<tolerance
	 def fixedPoint(f:Double => Double)(firstGuess:Double)={
		def iterate(guess:Double):Double={
			val next=f(guess)
			if(isCloseEnough(guess,next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	 }
	 def sqrt(x:Double)=fixedPoint(averageDamp( y => x/y))(1)
}
