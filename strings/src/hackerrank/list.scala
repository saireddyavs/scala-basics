package hackerrank

import scala.collection.mutable.ListBuffer

object list {
  def main(Args:Array[String]){
    val f1=new ListBuffer[Int]()
    println("enter n")
    val n=scala.io.StdIn.readInt()
    for(i<-1 to n){
      val n1=scala.io.StdIn.readInt()
      f1+=n1
    }
    val f2=f1.toList
    println(f2)
  }
  def displayResult(arr:List[Int]) ={
 println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))
 }
   def f(num:Int,arr:List[Int]):List[Int]={
   
 }
    
  

}
 