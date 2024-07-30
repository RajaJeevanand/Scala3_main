object MergeSort extends App {

//  Merge Sort
  def mergeSort(lst: List[Int]): List[Int] = {
    def merge(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
      case(Nil, _) => right
      case(_, Nil) => left
      case(x :: xs, y :: ys) =>
        if(x < y) x :: merge(xs, right)
        else y :: merge(left, ys)
    }

    val n = lst.length/2
    if(n == 0) lst
    else {
      val (left, right) = lst splitAt n
      merge(mergeSort(left) ,mergeSort(right))
    }
  }
  println(mergeSort(List(1, 45, 2, 3, 6, 96, 50, 25, 60, 55)))
}
