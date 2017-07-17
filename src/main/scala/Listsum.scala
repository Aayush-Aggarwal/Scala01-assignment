/**
  * Created by knoldus on 7/17/17.
  */
class Listsum {

  def addList(l1:List[Int], l2: List[Int]):List[Int] = {
    val x = 0
    def add(l1:List[Int], l2:List[Int], out:List[Int], x:Int): List[Int] = {
      if (x>=l1.length)
        out
      else add(l1,l2,(l1(x)+l2(x)) :: out,x+1)
    }
    val out = List[Int]()
    add(l1,l2,out,x).reverse
  }

}
