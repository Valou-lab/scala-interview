package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:Map[String, List[String]] = {
      val result = scala.collection.mutable.Map[String, List[String]]()
      devNames.keys.foreach((k) =>
        if (result.contains(devDepartments(k))) {
            result(devDepartments(k)) = devNames(k) :: result(devDepartments(k));
        }
        else {
            result.put(devDepartments(k), List(devNames(k)));
        }
    )
    result.toMap
  }
}
