import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class HighorderfunctionTest extends FunSuite {

  val hof= new Highorderfunction()

  test("Sum of squares"){
    assert(hof.sum(hof.square,10,5)===125)
  }

  test("Sum of cubes"){
    assert(hof.sum(hof.cubes,10,5)===1125)
  }

  test("Sum of ints"){
    assert(hof.sum(hof.ints,10,5)===15)
  }

}
