object Array2D {

  // Complete the hourglassSum function below.
  def hourglassSum(arr: Array[Array[Int]]): Int = {
    val dim1 = arr.length
    val dim2 = arr(0).length
    var maxSum :Int = Int.MinValue
    var tSum :Int = 0

    for ( x <- 0 to dim1-3; y <- 0 to dim2 -3) {
      tSum = arr(x)(y) + arr(x)(y+1)+ arr(x)(y+2) +
             arr(x+1)(y+1)  +
             arr(x+2)(y) + arr(x+2)(y+1)+ arr(x+2)(y+2)
      maxSum = if (tSum > maxSum) tSum else maxSum
    }
    return maxSum
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }
    println(arr.length)
    println(arr.size)
    println(arr(0).length)
    println(arr(0).size)
    print(arr(0)(0), arr(0)(1), arr(1)(0), arr(1)(1))
    val result = hourglassSum(arr)
    print(result)
//    printWriter.println(result)

//    printWriter.close()
  }
}