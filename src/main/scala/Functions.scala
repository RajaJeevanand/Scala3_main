object Functions  extends App {

  // 1. Function Declarations
  def add(a: Int, b: Int): Int = {
    //2. Function Definitions
    a + b
  }
  //3. Calling Functions
  println(s"Add:: ${add(10, 20)}")

  //4. Function Call-by-Name
  def callByName(x: => Int): Unit = {
    println("X1 = " + x)
    println("X2 = " + x)
  }
  def geek(): Int = {
    println("Greek")
    42
  }
  callByName(geek())

  //5. Function with Variable Arguments
  def printAll(args: String*): Unit = {
    args.foreach(println)
  }
  printAll("Hi", "i'm", "RJ")

  //6. Function Default parameter values
  def thanks(name: String = "Welcome"): String = s"$name"

  print(thanks())
  println(thanks("RJ"))

  //7. Nested Functions
  def outterFunction(num: Int, num2: Int): Int = {
    def innerFunction(num3: Int, num4: Int): Int = num3 + num4
      innerFunction(num, num2)
  }
  println(outterFunction(2, 3))
  //8. Partially Applied Functions
  //9. Function with Named arguments
  //10. Recursion Functions
  //11. Scala v Higher-Order Functions
  //12. Anonymous Functions
  //13. Currying Functions


}
