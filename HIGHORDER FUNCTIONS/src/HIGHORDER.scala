

object HIGHORDER {
  
  def math(x:Double,y:Double,f:(Double,Double)=>Double):Double=f(x,y)
  def main(args:Array[String]){
    val result=math(10,20,(x,y)=>x+y)
    println(result)
     val result1=math1(10,20,30,(x,y)=>x+y)//in place of ,(x,y)=>x+y we can write _+_ also it will give same answer
    println(result1)
  }
  
  
  def math1(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z)
  
  
}