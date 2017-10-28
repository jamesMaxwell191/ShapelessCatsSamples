package com.marcom.instances.future

import cats.Functor
import org.scalatest.{ Matchers, WordSpec}
import scala.concurrent.ExecutionContext.Implicits.global
import com.marcom.instances.future._

import scala.concurrent.Future

class FutureFunctorTest extends WordSpec with Matchers {

  "a functor" should {
     "do iy" in {
        val f = Functor[Future]
        f should not be(null)
     }
  }

}
