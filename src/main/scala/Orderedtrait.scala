/**
  * Created by knoldus on 7/17/17.
  */
class Orderedtrait(val name: String, val age: Int) extends Ordered[Orderedtrait]{

  override def compare(that: Orderedtrait): Int = {
    if(this.name.equals(that.name))
    {
      this.age - that.age
    }
    else this.name.length - that.name.length
  }

}
