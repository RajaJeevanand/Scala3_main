object AdvancedPatternMatching extends App {

  class Person(val name: String, val age: Int)

  object Person {
    def unapply(person: Person): Option[(String, Int)] =
      if(person.age < 21) None
      else Some(person.name, person.age)

    def unapply(age: Int): Option[(String)] =
      Some(if(age < 21) "major" else "minor")
  }

  val bob = new Person(name = "Bob", age = 24)
  val greeting = bob match {
    case Person(n,a) => s"$n $a years old!"
  }

  val st = bob.age match {
    case(status) => s"Status $status"
  }
  println(greeting)
  println(st)
//*********************************************************************

//  Infix Pattern
  case class Or[A, B](a: A, b: B)
  val either = Or(2, "Two")
  val result = either match {
    case number Or string => s"$number is writen in $string"
  }
  println(result)

//  val x = 10
//  val result = x match {
//    case 1 => "one"
//    case 2 => "two"
//    case _ => "many"
//  }
//  println(result)

//  val pair = (10, "hi")
//  val result = pair match {
//    case(n, a) if(n > 5) => s"$a yours $n years old!"
//  }
//  println(result)


}
