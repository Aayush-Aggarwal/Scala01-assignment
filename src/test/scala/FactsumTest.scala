import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class FactsumTest extends FunSuite {

  val fa=new Factsum()

  test("Value of the factorial of the number "){

    assert(fa.result(5)===3)
  }

}
