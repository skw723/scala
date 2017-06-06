package ch03

object Ex3_2 {
  def main(args: Array[String]): Unit = {
    //List.scala의 동반객체에 구현
    val list = List(1,2,3,4,5)
    println(list)
    val tailList = List.tail(list)
    println(list)
    println(tailList)
  }
}