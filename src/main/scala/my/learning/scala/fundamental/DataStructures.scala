package my.learning.scala.fundamental

// Tuple
// Immutable list
object DataStructures extends App {

  //Tuple
  val employee1 = (72697, "Rajesh Waghmode", "Citicorp Services India Pvt Ltd", "Technology", 6000000)

  println(employee1)

  //Refer to individual fields using ONE-BASED indexes
  println(employee1._1)
  println(employee1._2)
  println(employee1._3)
  println(employee1._4)

  val employee2 = (72698, "Rudrapratab Kale", "ISRO", "Technology", 40000000)
  val employee3 = (72699, "Rutwik Kale", "NASA", "Technology", 50000000)

  //List
  val employeesList = List(employee1, employee2, employee3)

  println(employeesList)
  println(employeesList.head)
  println(employeesList.tail)
  //<html>method + in class Int is deprecated since 2.13.0: Adding a number and a String is deprecated. Use the string interpolation `s&quot;$num$str&quot;`
  employeesList
    .map(e => "%d : %s".format(e._1, e._2))
    .foreach(t => println(t))

  //reduce
  var maxSalary = employeesList
    .map(e => e._5)
    .reduce((s1, s2) => {if(s1 > s2 ) s1 else s2})
  println(maxSalary)

  val minSalary = employeesList
    .map(e => e._5)
    .min
  println(minSalary)

  //Concatenate
  val additionalList = List((72700, "Prem Waghmode", "Mindnervs", "Technology", 7000000))

  val cancatenatedList = employeesList ++ additionalList
  println(employeesList)
  println(cancatenatedList)

  //Ordering

  println(employeesList.reverse)
  println(employeesList.sorted)

  //Map
  val employeesMap = Map(72697-> employee1, 72698-> employee2, 72699 -> employee3)
  println(employeesMap)
  println(s"72697 : ${employeesMap(72697)._2}")
  println(s"72698 : ${employeesMap(72698)._2}")
  println(s"72699 : ${employeesMap(72699)._2}")
//  employeesMap(72800) //NoSuchElementException: key not found: 72800
  val result = util.Try(employeesMap(72800)).getOrElse("Unknown") //Exception handling
  println(result)
}
