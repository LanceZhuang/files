object bubleSort {

  import util.control.Breaks._

  // Complete the countSwaps function below.
  def countSwaps(a: Array[Int]) {
    var totalCount = 0
    breakable {
      for (i <- 0 until a.length) {
        var innerCount = 0
        for (j <- 0 until a.length - 1) {
          if (a(j) > a(j + 1)) {
            val temp = a(j)
            a(j) = a(j + 1)
            a(j + 1) = temp
            innerCount += 1
          }
        }
        if (innerCount == 0) break; // all sorted
        totalCount += innerCount
      }
    }
    printf("Array is sorted in %d swaps\n", totalCount)
    printf("First Element: %d\n",a(0))
    printf("Last Element: %d\n",a(a.length-1))
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    countSwaps(a)
  }
}
