package package1


object Question01 {
  def applySeq(x:Int) (fList: List[Int=>Int]): Int = {
    if(fList.isEmpty){
      return x
    }
    //val func = fList.head_
    return applySeq(fList.head(x))(fList.tail)
  }
  def main(args: Array[String]): Unit = {
    println(applySeq(1)(List((x => x+1), (x => x*x),(x => x+5),(x => x+5),(x => x+5),(x => x+5),(x => x+5),(x => x+1),(x => x*x)) ))
  }
}
