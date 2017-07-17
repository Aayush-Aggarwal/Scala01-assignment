/**
  * Created by knoldus on 7/17/17.
  */
class Area {

  def area(shape: String, first: Int, second: Int, f:(Int,Int, String) => Int):String ={
    val sa = if(!shape.isEmpty) shape.toLowerCase else ""
    val m = f(first,second,sa)
    sa match {
      case "rectangle" => s"Area of rectangle is $m"
      case "rhombus" => s"Area of rhombus is $m"
      case "parallelogram" => s"Area of parallelogram is $m"
      case _ => s"Enter some known shape"
    }
  }

  def function(n1: Int, n2: Int, shape: String): Int = {
    val m = if(!shape.isEmpty) shape else ""

    m match {
      case "rectangle" => n1*n2
      case "rhombus" => n1*n2/2
      case "parallelogram" => n1*n2
      case _ => 0
    }
  }
}
