package james.exercises.euler

// If we list all the natural numbers below 10 that are multiples of 3 or 5, 
// we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

object Problem01 {
  def main(args: Array[String]) = {
    val answer = sum(
      (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0)
    )
    println(answer)
  }

  def sum(numbers : Seq[Int]) : Int = 
    numbers.foldLeft(0)((x,y) => x + y)
}
