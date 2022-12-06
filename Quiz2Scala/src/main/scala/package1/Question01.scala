package package1


object Question01 {
  def applySeq(x:Int) (fList: List[Int=>Int]): Int = {
    if(fList.isEmpty){
      return x
    }
    return applySeq(fList.head(x))(fList.tail)
  }
  def main(args: Array[String]): Unit = {
    println(applySeq(1)(List() ))
  }
}
