

object HelloWorld {
  val mylist : List[Int] = List(1,2,5,8,9,6,4);
  val names : List[String] = List("Max", "Tom", "John");
  def main(args: Array[String]) {
    println(0 :: mylist);
    println(0 :: 0 :: 0 :: mylist)
    println(mylist);
    println(names);
    println(Nil)
    println(1 :: 5 :: 9 :: Nil);
    println(mylist.head);
    println(mylist.tail);
    println(mylist.isEmpty);
    println(mylist.reverse);
    println(List.fill(5)(2));
    println(mylist.max)
    mylist.foreach(println)
    var sum : Int = 0;
    mylist.foreach(sum += _);
    println(sum);
    for (name <- names) {
      println(name);
    }
    println(names(0));
  }
}