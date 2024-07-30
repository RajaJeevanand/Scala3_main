object Functional_Collections extends App {

//  Higher order Functions: map, flatmap, filter, reduce, fold

//  List
  val list = List(1, 2, 3, 4, 5)
  val doubledList = list.map(_ * 2)
  println(s"Doubled List Numbers:: $doubledList")

//  vector
  val vectors = Vector(1, 2, 3, 4, 5)
  val evenNum = vectors.filter(_ % 2 == 0)
  println(s"Even numbers doubled:: $evenNum")

  val nums = Vector(1, 2, 3, 4, 5, 6, 7)
  val oddNum = vectors.filter(_ % 2 == 1)
  println(s"Odd Numbers Doubled:: $oddNum")

//  set
  val setValues = Set(1, 2, 3, 4, 5)
  val addNewSet = setValues + 6
  println(s"Added new Set value:: $addNewSet")

//  map
  val numbers = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val newMap = numbers + ("d" -> 4)
  println(s"updated Map $newMap")

//  stream
  val streamNumber = Stream.from(1)
  val sNumbers = streamNumber.take(20).toList
  println(s"Stream numbers:: $sNumbers")

}
