import scala.annotation.tailrec

object SortedFunc extends App {

  // Алгоритм, который проверяет, отсортирован ли массив по заданной последовательности()

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int): Boolean =
      if (n>= as.length -1) true
      else if (ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    loop(0)
  }

  println(isSorted(Array(1,3,6), (a: Int, b: Int) => a > b))

}
