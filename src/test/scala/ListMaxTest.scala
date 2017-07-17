import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class ListMaxTest extends FunSuite {

  val lst=new ListMax()

  test("Maximum of the given list"){

  assert(lst.maxElement(List(1,2,4,6,5))===6)
  }
}
