package ch02

object FindFirst {
  def findFirst(ss: Array[String], key: String): Int = {
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }
    loop(0)
  }
  
  def findFirstPolymorphic[A](ss: Array[A], p: A => Boolean): Int = {
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (p(ss(n))) n
      else loop(n + 1)
    }
    loop(0)
  }
}