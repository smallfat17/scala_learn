import scala.util.matching.Regex
//lazy day.....
object day02 {
  def main(args: Array[String]): Unit = {
    val numberPattern: Regex = "[0-9]".r
    numberPattern.findFirstMatchIn("awesomepassword1") match {
      case Some(_) => println("Password OK")
      case _ => println("Password must contain a number")
    }

    val keyValPattern: Regex = "([0-9a-zA-Z#() ]+): ([0-9a-zA-Z#() ]+)".r
    val input: String = """background-color: #A03300;
                          |background-image: url(img/header100.png);
                          |background-position: top center;
                          |background-repeat: repeat-x;
                          |background-size: 2160px 108px;
                          |margin: 0;
                          |height: 108px;
                          |width: 100%;""".stripMargin
    for (partternMath <- keyValPattern.findAllMatchIn(input))
      println(s"key: ${partternMath.group(1)} value: ${partternMath.group(2)}")
  }
}
