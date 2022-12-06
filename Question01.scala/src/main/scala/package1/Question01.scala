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
  def swapPair1(ltotal:List[Int],ans:List[Int]): List[Int] = {
    if(ltotal.length<=1){
      return ans++ltotal
    }
    return swapPair1(ltotal.tail.tail,ans++List(ltotal.tail.head)++List(ltotal.head))
  }
  def swapPair(l:List[Int]): List[Int] = {
    return swapPair1(l,List())
  }

  def main(args: Array[String]): Unit = {
//    val x = List(1,2,3,4)
//    println(insertLast(8,x))
  }





  }
