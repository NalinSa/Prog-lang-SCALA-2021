package package1

object Question01 {
  def insertLast(x:Any, l:List[Any]) : List[Any] = {
    if(l.isEmpty){
      return x :: Nil
    }
    else {
      return l.head :: insertLast(x, l.tail)
    }
  }






  }
