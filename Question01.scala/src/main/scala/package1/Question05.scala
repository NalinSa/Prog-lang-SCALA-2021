package package1

object Question05 {
  def myReverse(list: List[Any]):List[Any] ={
    if(list.isEmpty) {
      return List()
    }
    return myReverse(list.tail) ++ List(list.head)
  }
  def checkSame(l1:List[Any],l2:List[Any]):Boolean = {
    if(l1.isEmpty&&l2.isEmpty) {
      return true
    }
    else if(l1.isEmpty) {
      return false
    }
    else if(l2.isEmpty){
      return false
    }
    if(l1.head == l2.head){
      return checkSame(l1.tail,l2.tail)
    }
    else{
      return false
    }
  }
  def palindrome(list: List[Any]):Boolean ={
    return checkSame(list,myReverse(list))
  }
}
