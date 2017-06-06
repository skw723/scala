package ch03

object Ex3_5 {
  def main(args: Array[String]): Unit = {
    val list = List(1,1,1,2,3)
    println(list)
    val dropedList = List.dropWhile(list, (a: Int) => a == 1)
    println(list)
    println(dropedList)
    
    //append
    val appendList = List.append(list, dropedList)
    println(appendList)
    
    //dropWhile2
    val dropedList2 = List.dropWhile2(list)((a => a == 1))
    println(dropedList2)
  }
}