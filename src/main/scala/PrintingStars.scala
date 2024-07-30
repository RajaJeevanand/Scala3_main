object PrintingStars extends App {

// 1:-  Right-Angle Triangle

//  for(i <- 1 until 6) {
//    println("*" *i)
//  }

// 2:- Inverted Right-Angle Triangle

  for(i <- 5 to 1 by -1) {
    for(j <- 1 to i) {
      print("* ")
    }
    println()
  }

//  3:-
val rows = 5
  for (i <- 1 to rows) {
    for (j <- rows to i by -1) {
      print(" ")
    }
    for (k <- 1 to i) {
      print("*")
    }
    println()
  }
}
