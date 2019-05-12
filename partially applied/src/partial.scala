
import java.util.Date
object partial {

  def main(args: Array[String]) {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, 20, _: Int)
    println(f(30))
    val sum1 = (a: Int, b: Int, c: Int) => a + b + c
    val f1 = sum1(10, _: Int, _: Int)
    println(f1(10, 30))
    
    val date=new Date;
    val newlog=log(date,_:String)
    newlog("hello user1")
    newlog("hello user2")
    newlog("hello user3")
    newlog("hello user4")
    newlog("hello user5")
    newlog("hello user6")
    

  }
  
  def log(date:Date,message:String)={
    println(date + " "+ message)
  }
}