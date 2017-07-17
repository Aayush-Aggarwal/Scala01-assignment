/**
  * Created by knoldus on 7/17/17.
  */
class Highorderfunction {

  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int = {
    f(a,b)
  }

  def square(a: Int, b: Int) = a*a + b*b

  def cubes(a: Int, b: Int) = a*a*a + b*b*b

  def ints(a: Int, b: Int) = a + b

}
