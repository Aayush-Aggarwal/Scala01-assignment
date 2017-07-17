import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class ListsumTest extends FunSuite {

  val ls=new Listsum()

  test("Sum of two list"){

    assert(ls.addList(List(1,2,3,4,5),List(5,4,3,2,1))===List(6,6,6,6,6))
  }
}
