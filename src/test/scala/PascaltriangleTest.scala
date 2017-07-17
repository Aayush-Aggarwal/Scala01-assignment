import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class PascaltriangleTest extends FunSuite {

  val pas=new Pascaltriangle()

  test("Nth value of pascal triangle"){

    assert(pas.pascal(1,2)===2)
  }

  test("If value doesn't exist"){

    assert(pas.pascal(2,1)===(-1))
  }


}
