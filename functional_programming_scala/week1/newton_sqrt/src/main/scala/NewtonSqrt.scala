package fpscala.week1;
import scala.math._

class NewtonSqrt{


def sqrt(x:Double)={

def sqrtIter(guess:Double, x:Double):Double=
if (isGoodEnough(guess,x))guess
else sqrtIter(improve(guess,x),x)

def isGoodEnough(guess:Double, x:Double)= abs(guess*guess/x - 1)<0.001 

def improve(guess:Double, x:Double)= (guess+x/guess)/2

sqrtIter(x/2,x)
}

}