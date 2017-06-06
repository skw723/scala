package ch03

object Ex3_3 {
  def main(args: Array[String]): Unit = {
    //List.scala에 구현
    val list = List(1,2,3,4,5)
    println(list)
    val changedList = List.setHead(list, 7)
    println(list)
    println(changedList)
  }
}