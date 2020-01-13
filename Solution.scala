
object Solution {

  // Complete the sockMerchant function below.
  def sockMerchant(n: Int, ar: Array[Int]): Int = {
1

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val ar2: Array[Int] = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = sockMerchant(n, ar)
    println(n)
    println(ar)
    val listar: List[Int] = ar.toList
    listar.foreach(print("%d ", _))
    //    printWriter.println(result)

//    printWriter.close()
    println(result)
  }
}
