object markToys {

  // Complete the maximumToys function below.
  def maximumToys(prices: Array[Int], k: Int): Int = {

    val sorted: Array[Int] = prices.sorted
    println(sorted)
    var toyCount = 0
    var totalCost = 0
    for (i<- 0 until sorted.length) {
     if (totalCost+sorted(i) < k) {
       toyCount += 1
       totalCost += sorted(i)
     }
    }
    return toyCount
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val prices = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = maximumToys(prices, k)

    println(result)
//    printWriter.println(result)

//    printWriter.close()
  }
}
