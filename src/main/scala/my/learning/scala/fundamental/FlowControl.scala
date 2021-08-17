package my.learning.scala.fundamental

object FlowControl extends App {
  val intVal: Long = 99
  if (intVal > 100) {
    println("value is grater than 100")
  } else {
    println("value is less than 100")
  }
  intVal match {
    case 1000 => println("value is 1000")
    case 1001 => println("value is 1001")
    case 1002 => println("value is 1002")
    case _ => println("Not matched. Value is something else")
  }

  for(x <- 1000 to 1005)
    println("For loop: current value is "+ x)

  var x: Int = 1000
  while(x < 1005) {
    println("While loop: current value is "+ x)
    x+=1
  }
}