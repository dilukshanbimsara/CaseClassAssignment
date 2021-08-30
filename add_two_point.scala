
//Question 1
object case_class {
  def main(args: Array[String]) {
    val p1=point(1,2)
    val p2=point(2,3)
    val p3=p1+p2
    println(p1)
    println(p2)
    println(p3)
  }
  
  case class point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b
//Add function +()
    def + (that:point)= point(this.x+ that.x,this.y+that.y)
  }
}