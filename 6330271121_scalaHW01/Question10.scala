package package1

object Question10 {
  def chooseAlternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int,fUse:Int, list:List[Int],total:Int):Int ={
    if(list.isEmpty){
      return total
    }
    if(fUse==1){
      val recent1 = f1(total,list.head)
      return chooseAlternate(f1,f2,2,list.tail,recent1)
    }
    else{
      val recent2 = f2(total,list.head)
      return chooseAlternate(f1,f2,1,list.tail,recent2)
    }
  }
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    if(list.isEmpty){
      return 0;
    }
    else{
      return chooseAlternate(f1,f2,1,list.tail,list.head)
    }
  }
}
