import scala.math.pow

object distance {
  def main(args : Array[String]) {
    val p1 = point(2,1)
    val p2 = point(1,3)
    val p3 = point(3,5)
    
    val d1 = distance(p1, p2)
    val d2 = distance(p2, p3)
    
    println(p1)
    println(p2)
    println(p3)
    println(d1)
    println(d2)
  }
  
  case class point(a:Int, b:Int) {
    def x:Int = a
    def y:Int = b
    
    def - (that:point)= point(this.x- that.x,this.y-that.y)
  }
  
  def distance(x:point , y:point):Double = {
    def d:point = x-y
    return (math.sqrt((math.pow(d.x, 2)) + (math.pow(d.y , 2)))) 
  }
}