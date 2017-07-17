import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class DoublelistTest extends FunSuite {

  val dl=new Doublelist()

  test("Double of the list"){

    assert(dl.doubles(List(1,2,3,4))===List(2,4,6,8))
  }
}
