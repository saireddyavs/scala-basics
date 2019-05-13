package hackerrank

import scala.util.control.Exception._

//Write your code here

class Calculator(){  

def power(n1:Int,n2:Int)={
val s="n and p should be non-negative"
if(n1<0 || n2<0)
s
else
 scala.math.pow(n1,n2)
}
}


object Solution {

    def main(args: Array[String]) {
        var myCalculator=new Calculator();
        
        println(" sdf")
        var T=scala.io.StdIn.readLine().toInt

        while(T>0){
            val Array(n,p) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
            
            try{
                  var ans=myCalculator.power(n,p);
                  println(ans);
                  val n1=null
                  n1.equals("fg")
                  1
                  
            }
            catch{
                 case f:NullPointerException =>{
                  println("in casae nullpointer") 
                  println(f.getMessage())
                  
                  
                }
                case e: Exception => {
                    println(e.getMessage());
                }
                
             
            }
            T-=1;
        }
    }
}