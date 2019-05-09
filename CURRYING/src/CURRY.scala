
//curryiing is transforming a func
//takes single argumnets and makes multiple arguments
object CURRY {
  def add(x: Int, y: Int) = x + y
  def add2(x: Int) = (y: Int) => x + y
  def add3(x: Int)(y: Int) = x + y
  def main(args: Array[String]) {
    println(add(10, 20))
    println(add2(10)(20))
    val sum = add2(30)
    println(sum(40))
    println(add3(10)(10))
    val sum1 = add3(50)_; //use _ underscore to remove error that mean partial sending
    println(sum1(100))
  }
}