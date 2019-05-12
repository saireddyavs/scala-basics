

object Demmo {
  def main(args: Array[String]) {
    val age = 18
    age match {
      case 20 => print(age)
      case 20 => print(age)
      case 20 => print(age)
      case 20 => print(age)
      case 18 => print(age);
      case 19 => print(age)
      case 21 => print(age)
      case _  => print("default")

    }
    println("\t")
    val result = age match {
      case 20 => age
      case 20 => age
      case 20 => age
      case 20 => age
      case 18 => age
      case 19 => age
      case 21 => age
      case _  => "default"

    }
    println(result)
  }
}
