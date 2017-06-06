package ch02

object Ex2_5 {
  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    A => f(g(A))
  }

  def main(args: Array[String]): Unit = {
    val f = (b: Int) => b * 2
    val g = (a: Int) => a + 2
    val composeFunc = compose(f, g)
    println(composeFunc(2))
    
    val composeFunc2 = f compose g
    println(composeFunc2(2))
    
    val composeFunc3 = f andThen g  // == g compose f
    println(composeFunc3(2))
  }
}