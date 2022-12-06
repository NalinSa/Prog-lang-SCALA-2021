package package1

object Question06 {
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if(list.isEmpty){
      return List()
    }
    return f(list.head)::myMap(f)(list.tail)
  }
}
