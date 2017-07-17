/**
  * Created by knoldus on 7/16/17.
  */
class Fibterm {

  def fib2(n:Int):Int = {

    if(n==0 || n==1)
      n
    else
      fib2(n-1)+fib2(n-2)

  }

}
