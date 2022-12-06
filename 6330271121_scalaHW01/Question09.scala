package package1

object Question09 '{
  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    if(tape.isEmpty){
      return List()
    }
    if(n==0){
      return tape.head::turingStep(f,tape.tail,n)
    }
    return f(tape.head)::turingStep(f,tape.tail,n-1)
  }
}
