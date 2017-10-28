package com.marcom.instances.integer

import com.marcom.ap.ApplicationContext
import com.marcom.core.Mapping
import org.scalatest.Matchers
import com.marcom.instances.integer._

class IntegerPackageTest extends org.scalatest.WordSpec with Matchers {

   implicit val appCtx:ApplicationContext = new ApplicationContext {

   }

  "a mapping" should {
    "exist" in {
      val mapping = Mapping[Int,String]
      mapping should not be(null)
    }
  }

}
