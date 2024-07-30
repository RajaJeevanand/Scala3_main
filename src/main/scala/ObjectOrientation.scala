object ObjectOrientation extends App {

//  1:- Class and Object
  class Animal(val name: String, val age: Int) {
  def anAnimal(): String = s"CLASS & OBJECTS:::    Dog name is $name and $age years old"
}
  val dogDetails = new Animal("Ruby", 2)
  println(dogDetails.anAnimal())

//  singleton class
  object person {
  def geek(): String = "SINGLETON:::    Hii"
}
  println(person.geek())

//  ***********************************************************************

//  2:- Inheritance

  class person {
    def geeks(): String = "Hii I'm Fine"
  }
  class anotherPerson extends person {               // EXTENDS is KEYWORD to use the superclass object and methods
    override def geeks(): String = "INHERITANCE:::    I'm Good"       // override is used for override the string from superclass
  }

  val name = new anotherPerson()
  println(name.geeks())

//  **********************************************************************

// 3:- traits

  class Walker {
    def walk(): String = "TRAITS:::    I'm Walking"
  }
  class anotherWalker {
    def walks(): String ="TRAITS:::    I want to walk"
  }
  class person1(val name: String) extends anotherWalker
  val man = new person1("bob")
  println(man.walks())

//**********************************************************************

// 4:- Case Classes

  case class point(x: Int, y: Int)

  val x1 = point(1, 2)
  val y1 = point(1, 3)
  println(x1 == y1)

//  **************************************************************************

// 5:-   Encapsulation

  class Counter {
    private var count = 0

    def increment(): Unit = {
      count += 1
    }

    def getCount: Int = count
  }

  val counter = new Counter()
  counter.increment()
  println(counter.getCount)  // Output: 1

//  ****************************************************************************


// 6:- Polymorphism

  trait shape {
    def area(): Double
  }

  class Circle(val radius: Double) extends shape {
    def area(): Double = Math.PI * radius * radius
  }

  class Sqaure(val side: Double) extends shape {
    def area(): Double = side * side
  }

  val shapes: List[shape] = List(new Circle(2.5), new Sqaure(4.0))
  shapes.foreach(shape => println(shape.area()))


}

