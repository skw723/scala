package ch02

object Ex2_2 {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if(ordered(as(n), as(n + 1))) loop(n + 1)
      else false
    }
    loop(0)
  }
  
  def main(args: Array[String]): Unit = {
    println(isSorted(Array(1,2,3), (n1: Int, n2: Int) => {if (n1 <= n2) true else false}))
    println(isSorted(Array(1,3,2), (n1: Int, n2: Int) => {if (n1 <= n2) true else false}))
    println(isSorted(Array(3,2,1), f))
    println(isSorted(Array("1","2","3"), (s1: String, s2: String) => {if (s1 <= s2) true else false}))
    println(isSorted(Array("3","2","1"), (s1: String, s2: String) => {if (s1 <= s2) true else false}))
  }
  
  def f(n1: Int, n2: Int): Boolean = {
    if (n1 <= n2) true
    else false
  }
}