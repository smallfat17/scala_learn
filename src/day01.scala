import math._
//not the first day really but the first day for using IDEA
object day01 {
  def main(args: Array[String]): Unit = {
    val smallfatEmail = Email.fromString("myEmail@myDomainName.com")
    smallfatEmail match {
      case Some(email) => println(
        s"""
          |Email created sucessfully
          |UserName: ${email.userName}
           DomainName: ${email.domainName}
        """)
      case None => println("Error in your input format")
    }
  }
  def tupleTest : Unit = {
    val tuple = List(("jack",15),("lilith",20),("tom",19))
    for ((name,age) <- tuple) {
      println(name + " is " + age + " years old" )
    }
  }
}

case class Circle(radius: Double) {
  import Circle._
  def area: Double = calculatArea(radius)
}
object Circle{
  private def calculatArea(radius: Double): Double = Pi * radius * radius
}

class Email(val userName: String,val domainName: String)

object Email{
  def fromString(emailString: String) : Option[Email] = {
    emailString.split("@") match {
      case Array(a,b) => Some(new Email(a,b))
      case _ => None
    }
  }
}