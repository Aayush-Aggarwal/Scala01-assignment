import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class DoubleQueueTest extends FunSuite {


  val dq=new DoubleQueue(List(1,2,3))

  test("Double Queue test for enqueue") {
    assert(dq.enqueue(4).toString === List(1,2,3,8).toString)
  }
  test("Double Queue test for dequeue") {
    assert(dq.dequeue().toString === List(2,3).toString)
  }
  val sq=new SquareQueue(List(1,2,3))

  test("Square Queue test for enqueue") {
    assert(sq.enqueue(4).toString === List(1,2,3,16).toString)
  }
  test("Square Queue test for dequeue") {
    assert(sq.dequeue().toString === List(2,3).toString)
  }

}
