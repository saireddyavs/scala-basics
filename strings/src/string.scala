

object string {
 val str1:String="hello world"
 val str2:String="hello rgukt"
 val num1=23
 val num2=100.25
  def main(args:Array[String]){
   println(str1)
   println(str1.length());
   println(str1.concat(str2))
   println(str1+" " +str2)
   println(str1+str2)
   val result=printf("(%d -- %f---%s)",num1,num2,str1)
   println(result)
   printf("(%d -- %f---%s)",num1,num2,str1)
   
   println("(%d -- %f---%s)".format(num1,num2,str1))
 }
}
