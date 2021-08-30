

object move_point {
  def main(args : Array[String]) {
    val p1 = point(0,1)
    val p2 = point(2,4)
    val mp1 = p1.move(2, 2)
    val mp2 = p2.move(2, 2)
    
    println(p1)
    println(p2)
    println(mp1)
    println(mp2)
  }
  
  case class point(a:Int, b:Int){
    def x:Int = a
    def y:Int = b
    
    def move(mx:Int , my:Int) = point(this.x+mx, this.y+my)
  }
}