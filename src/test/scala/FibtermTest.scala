import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class FibtermTest extends FunSuite {

  val fib=new Fibterm()

  test("Nth term for the fibonacci series "){

    assert(fib.fib2(3)===2)
  }

}
