package package1

object Question03 {
  def checkInList(x:Any, l:List[Any]):Boolean = {
    if(l.isEmpty){
      return false;
    }
    if(x==l.head){
      return true
    }
    else {
      return checkInList(x,l.tail)
    }

  }
  def subList(l1:List[Any],l2:List[Any]):Boolean = {
    if(l1.isEmpty) {
      return true
    }
    if(checkInList(l1.head,l2)) {
      return subList(l1.tail, l2)
    }
    else{
      return false
    }
  }
}
