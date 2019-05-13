

object aets {
  def main(args: Array[String]) {
    //no duplicates in sets and unordered collection
    val myset = Set(1, 2, 3, 4, 1, 2, 3, 1);
    println(myset)
    var myset1 = scala.collection.mutable.Set(1, 2, 3, 4, 10, 40, 404);
    println(myset1)
    println(myset(30))
    println(myset.head);
    println(myset.tail);
    println(myset.isEmpty);
    println(myset ++ myset1);
    val myset2 = Set(23, 5, 67, 1, 2, 3, 4, 4, 1);
    println(myset2)
    println(myset.++(myset2))
    println(myset.&(myset2))
    println(myset.intersect(myset2))
    

  } 
}