package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    if (params.isEmpty {
      return "";
    }
    else {
      params.foldLeft("?") {
        (s: String, pair: (String, String)) =>
        if (s.length == 1) {
          s + pair._1 + "=" + pair._2;
        }
        else {
          s + "&" + pair._1 + "=" + pair._2;
        }
      };
    }
  }


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = {
    val Email = """(\w+)@([\w\.]+)""".r
    maybeEmail.matches(Email.toString)
  }


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    if (n == 0) {
      return 1;
    } 
    else if (n % 2 == 0) {
      return power(i, n / 2) * power(i, n / 2);
    } 
    else {
      return i * power(i, n / 2) * power(i, n / 2);
    } 
  }

}
