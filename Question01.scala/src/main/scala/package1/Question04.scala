package package1

import package1.Question01.insertLast

object Question04 {
  /*def findLeast(x:Int, l:List[Int]): Int ={
    if(l.isEmpty){
      return x
    }
    if(x<=l.head){
      return findLeast(x,l.tail)
    }
    else{
      return findLeast(l.head,l.tail)
    }
  }
  def deleteNum(x:Int, l:List[Int]): List[Int] ={
    if(l.isEmpty){
      return List()
    }
    if(x==l.head){
      return l.tail
    }
    else{
      return l.head :: deleteNum(x,l.tail)
    }
  }*/
  def merge(l1:List[Int],l2:List[Int]):List[Int] = {
    if(l1.isEmpty&&l2.isEmpty) {
      return List()
    }
    else if(l1.isEmpty) {
      return l2.head :: merge(l1,l2.tail)
    }
    else if(l2.isEmpty){
      return l1.head :: merge(l1.tail,l2)
    }
    if(l1.head <= l2.head){
      return l1.head :: merge(l1.tail,l2)
    }
    else{
      return l2.head :: merge(l1,l2.tail)
    }
  }

  def mergesort(list: List[Int]):List[Int] ={
    if(list.isEmpty) {
      return List()
    }
    return merge(List(list.head),mergesort(list.tail))
  }
  def main(args: Array[String]): Unit = {
    val x = List(4, 5, 4, 6, 1, 2)
    println(mergesort(x))
  }
}
