

object HelloWorld {
  val mymap : Map[Int, String] = 
      Map(801 -> "Max", 802 -> "Tom", 804 -> "July", 804 -> "Julyy");
  val mymap2 : Map[Int, String] =
    Map(805 -> "Lua");
  def main(args: Array[String]) {
    println(mymap);
    println(mymap(801));
    println(mymap.keys);    
    println(mymap.isEmpty);
    
    mymap.keys.foreach {key =>
      println("Key " + key);
      println("Value " + mymap(key));
    }
    //println(mymap(801000));//Gives exception
    println(mymap.contains(801000));
    println(mymap ++ mymap2);
    println(mymap.size);
  }
}