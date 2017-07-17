import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class AreaTest extends FunSuite {

  val a= new Area()

  test("Area of rectangle"){

    assert(a.area("rectangle",10,15,a.function).equals("Area of rectangle is 150"))
  }

  test("Area of rhombus"){

    assert(a.area("rhombus",10,15,a.function).equals("Area of rhombus is 75"))
  }

  test("Area of parallelogram"){

    assert(a.area("parallelogram",10,15,a.function).equals("Area of parallelogram is 150"))
  }

  test("Default case check"){

    assert(a.area("rm",10,15,a.function).equals("Enter some known shape"))
  }

}
