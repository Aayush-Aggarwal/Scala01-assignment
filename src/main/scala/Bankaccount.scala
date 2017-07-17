/**
  * Created by knoldus on 7/16/17.
  */
class Bankaccount(id: Int, name: String, balance: Double) {

  require(id>0 && name != "")

  def getId: Int = this.id
  def getName: String = this.name
  def getBal: Double = this.balance

  def credit(amount: Double): Bankaccount = {
    new Bankaccount(this.id, this.name, balance + amount)
  }

  def debit(amount: Double): Bankaccount = {
    if (balance < amount) {
     // println("Can't proceed, insufficient balance!")
      new Bankaccount(this.id, this.name, balance)
    }
    else {
      new Bankaccount(this.id, this.name, balance - amount)
    }
  }

}
