object PartialFunction extends App {


//  1:- isDefinedAt Method
//  2:- Apply Method
//  3:- Collect Method

// More Methods
//  4: orElse
//  5:- lift

//  Define the partial function
  val doubleEvenNumbers: PartialFunction[Int, Int] = {
    case x if x % 2 == 0 => x * 2
  }
//  Inserting the values to the list
  val numbers = List(1, 2, 3, 4, 5, 6)

// creating the partial funtion
  val doubleEvens = numbers.collect(doubleEvenNumbers)

//   Printing the values from Partial function
  println(s"$numbers")
  println(s"Double Even Numbers: ${doubleEvens}")
}
