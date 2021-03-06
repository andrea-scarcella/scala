package fpscala.week2
import math.abs
class Rational(x:Int,y:Int)  {
	private val g=gcd(x,y)
	val numer=x/g
	val denom=y/g
	def gcd(a:Int,b:Int):Int={
		if (b==0) a else gcd(b,a%b)
	}
	
	
	def unary_- =new Rational(-numer,denom)
	def +(other:Rational)={
		new Rational(numer*other.denom+other.numer*denom,denom*other.denom)
	}
	override def toString = numer +"/" + denom
	def -(other:Rational)={
	this + -other
	}
	def < (other:Rational)= this.numer*other.denom<this.denom*other.numer
	
}
