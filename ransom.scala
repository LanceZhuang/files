object ransom {

  // Complete the checkMagazine function below.
  def checkMagazine(magazine: Array[String], note: Array[String]) {


  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val mn = stdin.readLine.split(" ")

    val m = mn(0).trim.toInt

    val n = mn(1).trim.toInt

    val magazine = stdin.readLine.split(" ")

    val note = stdin.readLine.split(" ")
    checkMagazine(magazine, note)
  }
}
