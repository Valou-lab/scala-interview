package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    lazy val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ? 
                /* It prints "Paris". */
  Supporter.support //What does this print and why ? How to fix it ? 
                /* It prints "Ici c'est null !" because the initialization of "support" is done 
                before "city" is overwritten. So we can fix it with the keywords "lazy" before "support". */
}
