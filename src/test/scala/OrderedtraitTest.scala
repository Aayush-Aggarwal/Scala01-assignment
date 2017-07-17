import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class OrderedtraitTest extends FunSuite {

  test("testing ordered trait methods"){
    assert((new Orderedtrait("Ayush",21) < new Orderedtrait("Ayush",24)) === true)
  }

  test("testing ordered trait methods again "){
    assert((new Orderedtrait("Ayush",21) > new Orderedtrait("Aayush",24)) === false)
  }

}
