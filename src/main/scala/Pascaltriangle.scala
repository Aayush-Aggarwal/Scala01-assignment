/**
  * Created by knoldus on 7/17/17.
  */
class Pascaltriangle {

  def pascal(c: Int, r: Int): Int = {
    if (c > r) {
      -1
    }
    else if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}
