package package1

object Question01 {
//  def insertLast(x:Any, l:List[Any]) : List[Any] = {
//    if(l.isEmpty){
//      return x :: Nil
//    }
//    else {
//      return l.head :: insertLast(x, l.tail)
//    }
//  }
  def swapPair(l:List[Int]): List[Int] = {
    if(l.isEmpty){
      return List();
    }
    if(l.tail.isEmpty){
        return List(l.head);
      }
      else {
        List[Int] lis = List(l.tail.head, l.head)++swapPair(l.tail.tail);
        return lis;
      }
  }

  def main(args: Array[String]): Unit = {
    val x = List(1,2,3,4)
    println(insertLast(8,x))
  }





  }
