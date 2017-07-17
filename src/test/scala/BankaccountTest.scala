import org.scalatest.FunSuite

/**
  * Created by knoldus on 7/17/17.
  */
class BankaccountTest extends FunSuite {

  val ba=new Bankaccount(1, "Ayush", 0.0)
  val ba2 = ba.credit(4000.0)
  test("Amount after credit") {

    assert(
      ba2.getId === 1 &&
      ba2.getName.equals("Ayush") &&
      ba2.getBal === 4000.0
    )
}
 test(" Amount after debit ") {
val ba3 = ba2.debit(2000)
   assert(
     ba3.getId === 1 &&
       ba3.getName.equals("Ayush") &&
       ba3.getBal === 2000.0
   )
 }
  test("Amount debit more then available amount"){
    val ba3 = ba2.debit(5000)
    assert(
      ba3.getId === 1 &&
        ba3.getName.equals("Ayush") &&
        ba3.getBal === 4000.0
    )
  }
}
