package fpscala.week1

class Currying  {
	
	  def product(f: Int => Int)(a: Int, b: Int): Int = {
		
          if (a > b) 1
		 
          else product(f)(a+1,b)*f(a)
	  }
}
