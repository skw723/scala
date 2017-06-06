package ch03

object Ex3_4 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(list)
    val dropedList = List.drop(list, 3)
    println(list)
    println(dropedList)
  }
}