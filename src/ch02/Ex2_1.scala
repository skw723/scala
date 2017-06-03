package ch02

object Ex2_1 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else go(n - 1, cur, prev + cur)
    }
    go(n, 0, 1)
  }
  
  def main(args: Array[String]): Unit = {
    println(fib(1))
  }
}