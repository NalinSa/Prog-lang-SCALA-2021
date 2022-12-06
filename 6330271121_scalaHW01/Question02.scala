package package1

object Question02 {
  def insertInOrder(x:Int, list:List[Int]):List[Int] = {
    if(list.isEmpty){
      return List(x)
    }
    if(x<=list.head){
      return x::list
    }
    else{
      return list.head :: insertInOrder(x,list.tail)
    }
  }
}
