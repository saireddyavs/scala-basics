

object FUNC {
  def main(args: Array[String]) {
    println(add(10, 4))
    println(sub(10, 4))
    println(mul(10, 4))
    println(divide(10, 4))
    println(percent(10, 4))
    println(math.sub(10, 4))
    println(math square 4) //any way it will take if we are provinding single argument
    println(math1.sub())
    println(math1 square ()) //we can provide values in the function also by defult
    println(math2.sub(10))
    println(math2 square 4) //if we send only single value default value is replaced with this and second value remain default
    math3.sub()
    math4.+(3, 4)
    var ad = (x: Int, y: Int) => x + y //anynomus function
    println(ad(23, 32))
  }
  object math4 {

    def +(x: Int, y: Int) = println(x + y) //giving symbols AS functions is alo valid
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  object math {
    def sub(x: Int, y: Int): Int = return x - y
    def square(x: Int): Int = x * x

  }
  object math1 {
    def sub(x: Int = 34, y: Int = 90): Int = return x - y
    def square(x: Int = 4): Int = x * x

  }
  object math2 {
    def sub(x: Int = 34, y: Int = 90): Int = return x - y
    def square(x: Int = 4): Int = x * x
  }
  def sub(x: Int, y: Int): Int = return x - y

  def mul(x: Int, y: Int) = x * y //no problem

  def divide(x: Int, y: Int) = x / y //we can write direct also if we dont write it will take return as last statement

  def percent(x: Int, y: Int): Int = {
    return x % y
  }
  object math3 {
    def sub(x: Int = 34, y: Int = 90): Unit = {
      println(x - y) //will not return anything
    }

  }

}