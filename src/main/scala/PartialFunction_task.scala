object PartialFunction_task extends App{

//  Task 1: Create a Partial Function to Handle Specific Cases
//  1:- Define a partial function squarePositiveNumbers that squares positive numbers.
//  2:- Test the function with a list of numbers List(-3, -2, -1, 0, 1, 2, 3).
//  3:- Use the collect method to apply the partial function and print the results.

//Define the partial Funnction

  println("Task 1: Create a Partial Function to Handle Specific Cases")

  val squarePositiveNumbers: PartialFunction[Int, Int] = {
    case x if x > 0 => x * x
  }

// Create a list for Partial Function

  val t1Numbers = List(-3, -2, -1, 0, 1, 2, 3, 4)
  val pNumbers = t1Numbers.collect(squarePositiveNumbers)
  val nNumbers = t1Numbers.collect(squarePositiveNumbers)
  println(s"$t1Numbers")
  println(s"Positive Numbers: ${pNumbers}")
  println(s"Negtive Numbers: ${nNumbers}")

  println("**********************************************************************")
  println("**********************************************************************")


//  Task 2: Combine Partial Functions
//  1: Define a partial function doubleEvenNumbers that doubles even numbers.
//  2: Define a partial function tripleOddNumbers that triples odd numbers.
//  3: Combine these functions into a single function doubleOrTriple using orElse.
//  4: Test the combined function with a list of numbers List(1, 2, 3, 4, 5, 6) and print the results.

//  Method orElse

  println("Task 2: Combine Partial Functions")

  val doubleEvenNumbers: PartialFunction[Int, Int] = {
    case x if x % 2 == 0 => x * 2
  }

  val tripleOddNumber: PartialFunction[Int, Int] = {
    case x if x % 2 != 0  => x * 3
  }

  val t2Numbers = List(1, 2, 3, 4, 5, 6)

  val doubleOrTriple: PartialFunction[Int, Int] = doubleEvenNumbers.orElse(tripleOddNumber)
  val t2Result = t2Numbers.collect(doubleOrTriple)

  println(s"Default List: ${t2Numbers}")
  println(s"$t2Result")

  println("**********************************************************************")
  println("**********************************************************************")

//  Task 3: Use lift Method with Partial Function
//  1: Define a partial function subtractTenIfGreaterThanTen that subtracts 10 from numbers greater than 10.
//  2: Use the lift method to convert it into a total function liftedSubtractTen.
//  3: Test the lifted function with inputs List(5, 10, 15, 20) and print the results.

//  lift Method

  println("Task 3: Use lift Method with Partial Function")

  val subtractTenIfGreaterThanTen: PartialFunction[Int, Int] = {
    case x if x > 10 => x - 10
  }

  val liftedSubtractTen = subtractTenIfGreaterThanTen.lift
  val t3Numbers = List(5, 10, 15, 20)

  val t3Result = t3Numbers.map(liftedSubtractTen)

  println(s"Original List::: ${t3Numbers}")
  println(s"Results::: ${t3Result}")

  println("**********************************************************************")
  println("**********************************************************************")

//

}
