package fpscala.week2
import math.abs
class Rational(x:Int,y:Int)  {
	def numer=x
	def denom=y
	def neg=new Rational(-numer,denom)
	def add(other:Rational)={
		new Rational(numer*other.denom+other.numer*denom,denom*other.denom)
	}
	override def toString = numer +"/" + denom
	def sub(other:Rational)={
	this.add(other.neg)
	}
}
