import scala.annotation.tailrec

object MyModule {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int) = { // может вызываться только члденами MyModule
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x)) // заменяет %d на два числа соотвественно
  }

  def factorial(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int =
      if (n <=0) acc
      else go(n-1, n * acc)
    go (n, 1)
  }

  private def formatFactorial(n:Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(6))
  }
}
