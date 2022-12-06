package package1

object Question08 {
  def sum2List(oldList: List[Int],addList: List[Int]) : List[Int] = {
    if(oldList.isEmpty&&addList.isEmpty){
      return List()
    }
    else if(oldList.isEmpty){
      return addList.head::sum2List(oldList,addList.tail)
    }
    else if(addList.isEmpty){
      return oldList.head::sum2List(oldList.tail,addList)
    }
    else{
      return (oldList.head+addList.head)::sum2List(oldList.tail,addList.tail)
    }
  }
  def sumAllList(oldList: List[Int],lists:List[List[Int]]): List[Int] = {
    if(lists.isEmpty){
      return sum2List(oldList,List())
    }
    val recent = sum2List(oldList,lists.head)
    return sumAllList(recent,lists.tail)
  }

  def sumAll(lists:List[List[Int]]) :List[Int] = {
    sumAllList(List(),lists)
  }

}
