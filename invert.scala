

object invert {
  def main(args : Array[String]) {
    val p1 = point(0, 5)
    val p2 = point(5, 10)
    
    println(p1)
    println(p1.invert())
    
    println(p2)
    println(p2.invert())
  }
  
  case class point(a:Int, b:Int) {
    def x:Int = a
    def y:Int = b
    
    def invert() = point(y,x)
  }
}