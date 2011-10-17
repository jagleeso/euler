package james.exercises.euler

// Various functions which are of use in more than one euler problem.

object EulerUtil {

  def sum(numbers : Seq[Int]) : Int = 
    numbers.foldLeft(0)((x,y) => x + y)

}
