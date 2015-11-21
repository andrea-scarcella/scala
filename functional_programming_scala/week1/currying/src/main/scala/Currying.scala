package fpscala.week1

class Currying  {
	
	  def product(f: Int => Int)(a: Int, b: Int): Int = {
		
          if (a > b) 1
		 
          else product(f)(a+1,b)*f(a)
	  }
	  def factorial(n:Int)={
	  product((v:Int) => v)(1,n)
	  }
	  def generalized(combine:(Int,Int)=>Int, unit:Int)(f: Int => Int)(a: Int, b: Int): Int={
	   if (a > b) unit
		 
          else combine(generalized(combine,unit)(f)(a+1,b),f(a))
	  }
	  def gp(f: Int => Int)(a: Int, b: Int): Int = {
		generalized((x:Int,y:Int)=>x*y,1)(f)(a,b)
	  }
	  
	  def sum(f: Int => Int)(a: Int, b: Int): Int = {
        def loop(a: Int, acc: Int): Int = {
          if (a > b) acc
		  
          else loop(a+1,acc+ f(a))
        }
        loop(a, 0)
      }
	   def gs(f: Int => Int)(a: Int, b: Int): Int = {
		generalized((x:Int,y:Int)=>x+y,0)(f)(a,b)
	  }
}
