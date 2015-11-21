package fpscala.week1


class TailRecursion  {
//def fact(n:Integer):Integer={if(n==0) 1 else fact(n-1)*n }
def fact(n:Integer):Integer={
	def f(ft:Integer,n0:Integer):Integer={ if(n0==0) ft else f(ft*n0,n0-1)}
	f(1,n)
}
}
