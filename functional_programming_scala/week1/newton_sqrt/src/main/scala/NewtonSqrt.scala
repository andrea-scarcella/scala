package fpscala.week1;
import scala.math._

class NewtonSqrt{


def sqrt(x:Double)={

def sqrtIter(guess:Double):Double=
if (isGoodEnough(guess))guess
else sqrtIter(improve(guess))

def isGoodEnough(guess:Double)= abs(guess*guess/x - 1)<0.001 

def improve(guess:Double)= (guess+x/guess)/2

sqrtIter(x/2)
}

}