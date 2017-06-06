package ch02

object Ex2_4 {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (A, B) => f(A)(B)
  }
  
  def main(args: Array[String]): Unit = {
    val f = (a: Int) => (b: Int) => a + b
    println(f(1)(2))
    val uncurryF = uncurry(f)
    println(uncurryF(1, 2))
  }
}