package fpscala.week1

class Currying  {
	
	  def product(f: Int => Int)(a: Int, b: Int): Int = {
		 def loop(a: Int, acc: Int): Int = {
          if (a > b) acc
		  //else if (a==b) acc*f(b)
          else loop(a+1,acc* f(a))
        }
        loop(a, 1)
	  }
}
