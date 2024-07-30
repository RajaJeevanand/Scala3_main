import scala.io.StdIn.readInt

object EvenOddChecker extends App {

  //  EVEN & ODD Checker
// Its Shows the Length of Even or Odd Numbers

  println("Enter the number!")
  val number = readInt()

  //  checking the number which the user enter the Even or Odd nnumber
  if (number % 2 == 0) {
    
      println(s"Entered number $number is EVEN")
      var evens = for (i <- 2 to number by 2) yield i
      evens.foreach(println)
      println(s"Length of Even Number:: ${evens.length}")
  } else {
    
      println(s"Entered the number $number is ODD")
      var odds = for (i <- 1 to number by 2) yield i
      odds.foreach(println)
      println(s"Length of ODD Number:: ${odds.length}")
  }
}
