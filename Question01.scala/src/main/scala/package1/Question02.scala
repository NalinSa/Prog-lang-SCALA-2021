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
def partialMap1(l:List[String])(f1:String => String)(f2: String => Boolean)(ans:List[String]): List[String] = {
  if(l.isEmpty) return ans;
  if(f2(l.head)){
    return partialMap1(l.tail)(f1)(f2)(ans++List(f1(l.head)))
  }
  else{
    return partialMap1(l.tail)(f1)(f2)(ans++List(l.head))
  }

}
  def partialMap(l:List[String])(f1:String => String)(f2: String => Boolean): List[String] = {
    return partialMap1(l)(f1)(f2)(List())
  }
}
