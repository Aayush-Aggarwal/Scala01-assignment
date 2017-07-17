import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class ValueclassesTest extends FunSuite {

  val vc=new Valueclasses()

  test("Value class testing"){

    assert(vc.displayDetails(new FirstName("Ayush"),new LastName("Aggarwal"),new Age(21)).equals("Ayush Aggarwal is of 21 years."))
  }

}
