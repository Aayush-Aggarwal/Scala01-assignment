/**
  * Created by knoldus on 7/16/17.
  */

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class ConsecutivestrTest extends FunSuite {

val con=new Consecutivestr()

  test(" Consecutive two same alphabets "){

    assert(con.compute("aabbaccd")==="aabbcc")
  }

  test(" Consecutive three alphabets "){

    assert(con.compute("aabbbaccd")==="aabbcc")
  }
}

