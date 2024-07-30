object ExceptionHandling extends App {

//  basic Exception Handling
  val array = Array(1, 2, 3)
  try {
    println(array(4))
  } catch {
    case e: IndexOutOfBoundsException => println(s"Exception catch ${e.getMessage}")
  } finally {
    println("Exception of finally block")
  }

//
}
