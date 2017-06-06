package ch02

object Ex2_3 {
  def curry[A, B, C](f: (A, B) => C): A => B => C = {
    a => b => f(a, b)
  }
  
  def main(args: Array[String]): Unit = {
    val f = (a: Int, b: Int) => a + b
    val chain1 = curry(f)
    val chain2 = chain1(1)
    println(chain2(2))
  }
}