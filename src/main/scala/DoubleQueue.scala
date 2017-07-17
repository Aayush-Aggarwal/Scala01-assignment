/**
  * Created by knoldus on 7/17/17.
  */
class DoubleQueue(l: List[Int]) extends Queue{
  def enqueue(a: Int) =  new DoubleQueue(super.enqueue(l,a*2))


  def dequeue() = new DoubleQueue(super.dequeue(l))

  override def toString: String = s"$l"
}

trait Queue {
  def enqueue(l1: List[Int], a: Int): List[Int] = {
    println(a+" added\n")
    l1 ::: List(a)
  }

  def dequeue(l1: List[Int]): List[Int] = {
    val a = l1.head
    println(a+" removed\n")
    l1.tail
  }
}

class SquareQueue(l: List[Int]) extends Queue{
  def enqueue(a: Int) =  new SquareQueue(super.enqueue(l,a*a))


  def dequeue() = new SquareQueue(super.dequeue(l))

  override def toString: String = s"$l"
}