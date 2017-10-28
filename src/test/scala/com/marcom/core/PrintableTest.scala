package com.marcom.core

import org.scalatest.{Matchers, WordSpec}
import com.marcom.syntax.printable._
import com.marcom.instances.integer._

class PrintableTest extends WordSpec with Matchers {

  "a printable object" should {
    "print" in {
       val i = 4
       val s = i.print
       s should equal("4")
    }
  }

}
