object looping extends App {

//  While Loop
//  var list = Array("Do_While", "For", "While")
//  var index = 0
//
//  var result = while(index < list.length) {
//    if(list(index) == "While") println(s"index of While is: $index")
//    index += 1
//  }

//  For Loop
//  println("Which Table you want")
//  var num = scala.io.StdIn.readInt()
//
//  for (i <- 1 to 10) {
//    var table = i.*(num)
//    println(s"$num X $i = $table")
//  }

// Nested Loop
//for(i <- 1 to 3; j <- 1 to 3) {
//  println(s"i = $i; j = $j")
//}


//Using yeild
//  val sqaure = for(i <- 1 to 10) yield i + 2
//  println(sqaure)


//Using foreach
//val list = List(1, 2, 3, 4, 5)
//list.foreach(n => println(s"n = $n"))

//Maps & filter
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val squares = numbers.map(n => n * n)
  println(squares)

  val evenNumber = numbers.filter(n => n % 2 == 1)
  println(evenNumber)




}
