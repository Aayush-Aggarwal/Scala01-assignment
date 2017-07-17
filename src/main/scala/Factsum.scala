/**
  * Created by knoldus on 7/16/17.
  */
class Factsum {
  /*
  // recursion
    def factorial(n:Int):Int = {

      if(n==1 || n==0)
        1
      else
        n*factorial(n-1)

    }
  */
  // tail recursion
  def factorial2(n: Int): Int = {

    def comp(n: Int, fact: Int): Int = {
      if (n == 1 || n == 0)
        fact
      else
        comp(n - 1, n * fact)
    }

    comp(n, 1)
  }


  def sum(n: Int): Int = {

    if (n != 0)
      n % 10 + sum(n / 10)
    else
      0
  }

  def result(x: Int): Int = {
    val a = factorial2(x)
    sum(a)
  }
}
