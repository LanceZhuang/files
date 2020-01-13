object newYearChaos {

  // Complete the minimumBribes function below.
  def minimumBribes(q: Array[Int]) {
    var stepCount :Int = 0
    var step2 :Int = 0
    for ( x <- 0 until q.length) {
      val l :Int = q(x)-(x+1)
      step2 += l.abs
      println(l)
        q(x) -(x+1) match {
        case n :Int if n > 2 => println("Too chaotic"); return
        case n :Int if n > 0 && n < 3  =>  stepCount += n
        case _ =>
      }
    }
    stepCount
//    println
    println(step2)
    println(stepCount)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      minimumBribes(q)
    }
  }
}
