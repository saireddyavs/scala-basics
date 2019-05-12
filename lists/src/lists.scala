

object lists {
  def main(Args: Array[String]) {
    var mylist = List(1, 2, 3, 4, 56, 2, 4)
    println(mylist);
    for (i <- mylist; if i < 6) {

      println(i);
    }
    println(123456 :: mylist)
    mylist = 2344 :: mylist;
    println(mylist)
    println(Nil)
    println(1 :: 2 :: Nil)
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.reverse)
    println(List.fill(10)(1))
    // for sum of elements in list
    var sum: Int = 0;

    mylist.foreach(sum += _)
    println(sum)

    var count: Int = 0;
    for (i <- mylist) {
      count = count + 1
      println(count + ": " + i);

    }

  }
}