import scala.io.StdIn.*

object traitAndMixins extends App {

//  Traits and Mixins
//  trait greater {
//    def geek(name: String, age: Int): Unit = {
//      println(s"Hi, My name is $name")
//  }
//}
//  class person(val name: String, val age: Int) extends greater
//  val person = new person("RJ", 24)
//  person.geek(person.name, person.age)

  println("Enter your Name: ")
  val sName = readLine()
  println("Enter your Age: ")
  val sAge = readInt()


  trait studentsDetails {
    def sDetials(name: String, age: Int): Unit = {
      sDetials match
        case name => if (sName == "RJ" & sAge == 24) {
          println(s"your name is $sName and your $sAge years old!")
        } else println(s"Your Details not Found!")
//
//        case age => if(sAge == 24) {
//          println(s"your name is $sName and your $sAge years old!")
//        } else println(s"Your Details not Found!")
    }
  }
   
  class displayDetails(val name: String, val age: Int) extends studentsDetails
  val students = new displayDetails(sName, sAge)
  students.sDetials(students.name, students.age)
}
