object basics extends App {

//  defining the val and var
  val num: Int = 42
  var age = 24

//  Int, String, Char, Boolean, Float, Double, Long, Short
  val aFloat = 10.5f
  val aBoolean = true

//  String and String Operations
  val aString = "Hii"
  val conString = "Hii" + "Welcome to Scala"
  val sString = s"My $age years old"

// expressions = structures to reduced the value
  val anexpression = 2 + 3

// if-expression
  val ifex = if(age >= 19) "older" else "elder"

  val ifexpression: String =
    if (age >= 18) "older"
    else if (age <= 15) "school boy"
    else if (age <= 10) "Child"
    else "new born baby"

  println(ifexpression)

//  Code Block
  val items = {
    val item1 = 20;
    val item2 = 30

    val itemWeight = if (item1 >= item2) "item 1 is more weight" else "item 2 is more weight"
    println(itemWeight)
  }

// Define Function
  def myFunction(x: Int, y: Int) = {
    println(x + y)
  }
    myFunction(20,20)

//    recursive function
  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else n * factorial(n - 1)
  }
//    In Scala we don't use loop and iteration, WE USE RECURSION!
    println(factorial(4))

//  Unit type  UNIT is nothing return the value in other language its means VOID
  def unitType(): Unit = {
    println("Hi")
  }

}

