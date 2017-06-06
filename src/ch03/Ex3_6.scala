package ch03

object Ex3_6 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(list)
    val initList = List.init(list)
    println(list)
    println(initList)
  }
}