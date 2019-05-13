package spoj

import java.util.Scanner;
import scala.util.control.Breaks._;

object multiplication {
  
  def main(args:Array[String]){
    print("0")
    
    val sc=new Scanner(System.in);
    
    val n=sc.nextInt();
    
    for(i<- 1 to n){
      println("numbers")
      val n1=sc.nextInt()
      val n2=sc.nextInt();
      println(n1*n2)
    }
    
    
  }
  
}