package ch02

import scala.collection.immutable.Range.Partial

object PartialAndCurrying {
  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  def main(args: Array[String]): Unit = {
    val f = (a: Int, b: Int) => a + b
    val partial = partial1(10, f)
    println(partial(2))
    
    val f2 = (a: Int, b: Int, c: Int) => a + b + c
    println(curry(f2)(1)(2)(3))
  }
  
  def curry[A, B, C, D](f: (A, B, C) => D): A => B => C => D = {
    a => b => c => f(a, b, c)
  }
}