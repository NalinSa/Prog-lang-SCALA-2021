package package1

object Question02 {
//  def insertInOrder(x:Int, list:List[Int]):List[Int] = {
//    if(list.isEmpty){
//      return List(x)
//    }
//    if(x<=list.head){
//      return x::list
//    }
//    else{
//      return list.head :: insertInOrder(x,list.tail)
//    }
//
//  }
  def partialMap(l:List[String])(f1:String => String)(f2: String => Boolean): List[String] = {
    if(l.isEmpty){
      return List();
    }
    if(f2(l.head)){
      List[String] lis = f1(l.head)::partialMap(l.tail)(f1)(f2)
      return lis
    }
    else{
      List[String] lis = l.head::partialMap(l.tail)(f1)(f2)
      return lis
    }
  }
}
