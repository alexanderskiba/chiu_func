import scala.annotation.tailrec

object Fibonacci extends App {

  def fib(n:Int): Int ={
    @tailrec
    def helper(n: Int, prev: Int, cur: Int ): Int =
      if (n == 0) prev
      else helper(n - 1, cur, prev + cur)
    helper(n, 0 ,1)


  }
  println(fib(3))

}
