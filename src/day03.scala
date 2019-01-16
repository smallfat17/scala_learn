
object day03{
  def main(args: Array[String]): Unit = {
    testExtractorObject
  }
  def testExtractorObject = {
    val customer1ID = CustomerID("Sukyoung")
    customer1ID match {
      case CustomerID(myname) => println(myname)
      case _ => println("Coule not extract a CustomerID")
    }
    val customer2ID = CustomerID("Nico")
    val CustomerID(myname2) = customer2ID
    println(myname2)

    val CustomerID(myname3) = "a-asdfasdfasdf"
    println(myname3)
  }
}

//Extractor Object(提取器)
import scala.util.Random

object CustomerID{

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if(stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}



