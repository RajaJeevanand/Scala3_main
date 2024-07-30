object Collections extends App {

// Collections

// Basic Operations
// 1:- Given a list of integers, write a function that returns a new list containing only the even numbers.
  def listOfEven(nums: List[Int]) = {
    nums.filter(_%2 == 0)
  }
  println(listOfEven(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

//  2:- Write a Scala function that takes a list of strings and returns a list of the lengths of those strings.
  def lengthOfString(string: List[String]) = {
    string.map(_.length)
  }
  println(lengthOfString(List("Apple", "Banana", "Grapes")))

//  Transformations
//  3:- Given a list of integers, write a function that returns a new list where each integer is doubled.
  def doubledInteger(nums: List[Int]) = {
    nums.map(_ * 2)
  }
  println(doubledInteger(List(2, 4, 6, 8, 10)))

//  4:- Write a function that takes a list of names and returns a single string where all the names are concatenated together, separated by commas.
  def concatenatedString(string: List[String]): String = {
    string.mkString(", ")
  }
println(concatenatedString(List("Mark", "Leo", "Jhon")))

//  Filtering
// 5:- Given a list of integers, write a function that filters out all the prime numbers.
  def primeNumbers(n: Int): Boolean = {
    if(n <= 1) false
    else !(2 until n).exists(x => n % x ==0)
  }
  def filterPrimes(nums: List[Int]): List[Int] = {
    nums.filterNot(primeNumbers)
  }
  println("Filter Prime!!")
  println(filterPrimes(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

//  6:- Write a Scala function that takes a list of strings and filters out any string that contains the letter 'a'.
  def filterOutString(strings: List[String]): List[String] = {
    strings.filterNot(_.endsWith("ana"))
  }
  println(filterOutString(List("Apple", "Cherry", "Banana", "phone")))

//  Aggregation
//  7:- Write a function that takes a list of integers and returns the sum of all the elements.
  def sumOfAllElements(numbers: List[Int]): Int = {
    numbers.sum
  }
   println(sumOfAllElements(List(1, 2, 3)))

//   8:- Given a list of strings, write a function that returns a map where the keys are the strings and the values are the lengths of those strings.
  def keyString(key: List[String]): Map[String, Int] = {
    key.map(s => s -> s.length).toMap
  }
  val myList = List("apple", "cherry", "banana")
  println(keyString(myList))

//  Sorting
//  9:- Write a Scala function that takes a list of tuples (name, age) and returns the list sorted by age.
  val people = List(("John", 35), ("Mark", 23), ("David", 30))
  val sortedPeople = people.sortBy(_._2)
  sortedPeople.foreach(println)

//  10:- Given a list of strings, write a function that returns the list sorted in alphabetical order.
  def sortString(strings: List[String]): List[String] = {
    strings.sorted
  }
  println(sortString(List("Banana", "Cherry", "Apple")))

//  Set Operations
//  11:- Write a function that takes two lists of integers and returns their intersection.
  def findInersection(list1: List[Int], list2: List[Int]): List[Int] = {
    val set1 = list1.toSet
    val set2 = list2.toSet

    val intersection = set1.intersect(set2)
    intersection.toList
  }
  val list1 = List(1, 2, 3, 4, 5, 6)
  val list2 = List(2, 3, 4, 7, 1, 5)
  println(findInersection(list1, list2))

//  12:-  Write a Scala function that takes two sets of strings and returns a set containing the union of both sets.
  def setOfString(set1: Set[String], set2: Set[String]): Set[String] = {
    set1.union(set2)
  }
  val set1 = Set("apple", "banana", "Cherry")
  val set2 = Set("John", "Mark", "David")
  println(setOfString(set1, set2))

//  Maps
// 13:- Write a Scala function that takes a list of tuples (name, score) and returns a map where the keys are the names and the values are the scores.
  def tuplesToMap(tuples: List[(String, Int)]): Map[String, Int] = {
    tuples.toMap
  }
  val listOfName = List(("Bob:", 24), ("Mark:", 25), ("John:  ", 30))
  println(tuplesToMap(listOfName))

//  14:- Given a map of student names to their grades, write a function that returns the names of students who scored above a certain threshold.
  def studentsdetails(grades: Map[String, Int], threshold: Int): List[String] ={
    grades.collect {
      case (students, grades) if grades > threshold => students
    }.toList
  }
  val studentsGrades = Map("Bob" -> 85, "Mark" -> 65, "John" -> 90)
  val threshold = 80
  println(studentsdetails(studentsGrades, threshold))

//  Advanced Transformations
//  15:- Given a list of integers, write a function that returns a list of the squares of those integers.
  def squareOfListNumbers(square: List[Int]): List[Int] = {
    square.map(x => x * x)
  }
  val square = List(1, 2, 3, 6 , 5)
  println(squareOfListNumbers(square))

//  16:- Write a Scala function that takes a list of strings and returns a list of tuples, each containing the original string and its reverse.
  def stringAndReverse(strings: List[String]): List[(String, String)] = {
    strings.map(s => (s, s.reverse))
  }
  val strAndRev = List("Mark", "John", "Bob")
  println(stringAndReverse(strAndRev))

//  Fold/Reduce
//  17:- Write a function that takes a list of integers and returns their product using 'foldLeft'.
  def returnsOfIntegers(numbers: List[Int]): Int = {
    numbers.foldLeft(1)(_ * _)
  }
  val returnInt = List(1, 2, 3, 4, 6)
  println(returnsOfIntegers(returnInt))

//  18:- Given a list of strings, write a function that concatenates them into a single string using 'reduce'.
  def concatSingleString(single: List[String]): String = {
    single.reduce(_ + " " + _)
  }
  println(concatSingleString(List("Hi,", "my", "Name is", "RJ")))

//  Pattern Matching with Collections
// 19:- Write a Scala function that takes a list and returns "empty" if the list is empty, "one element" if the list has one element, and "multiple elements" if the list has more than one element.
  def elementEmptyOrNot(element: List[_]): String = {
    element match {
      case Nil => "Empty"
      case _ :: Nil => "One Element"
      case _ => "Multiple Element"
    }
  }
  val element_1 = List.empty[Int]
  val element_2 = List(42)
  val element_3 = List(1, 2, 3)

  println(elementEmptyOrNot(element_3))

//  20:- Given a list of tuples (name, age), write a function that uses pattern matching to find the first tuple where the age is greater than 30.
  def findFirstAbove30(above30: List[(String, Int)]): Option[(String, Int)] = {
    above30.collectFirst {
      case (name, age) if age > 30 => (name, age)
    }
  }
  var peopleMatch = List(("Mark", 30), ("John", 40), ("Bob", 25))
  var result = findFirstAbove30(peopleMatch)

  result match
    case Some((name, age)) => println(s"First person above 30 $name (Age: $age)")
    case none => println(s"no person above 30 found")
}



























