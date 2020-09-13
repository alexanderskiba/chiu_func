import scala.annotation.tailrec

object Polymorphic extends App {

  //Метод вернет первый индекс массива по переданному ключу(индекс этого ключа в массиве)
  def findFirst(ss: Array[String], key: String): Int = {
    @tailrec
    def loop(n: Int): Int = // рекурсия вместо цикла
      if (n>= ss.length) -1 // Вернем -1, ибо не попали в диапазон(число больше длины массива)
      else if (ss(n) == key) n // Если n-й элемент - это наш ключ, выводим индекс n
      else loop(n + 1) // переход к следующей итерации

    loop(0) // старт цикла(импровизированного) начинается с нуля
    // цикл остановится тогда, когда будет найдет элемент либо выйдем за диапазон длины массива
  }
//  println(findFirst(Array("flex","party","tysa","keks","peks","lalalal"), "peks"))


  def findFirstP[A](as: Array[A], p:A => Boolean): Int = {
    @tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n // вместо (ss(n) == key) n ;
        // Если функция p находит текущий элемент она вернет нам тру и мы возвращаем индекс
      else loop(n+1)
      // функция
    }
    loop(0)
  }



  println(findFirstP(Array("flex","party","tysa","KEKS","peks","lalalal"),(a: String) => a.contains("lala")))

}
