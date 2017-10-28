package com.marcom.instances

import com.marcom.core.Printable

package object integer {

  implicit val print:Printable[Int] = Printable.instance(_.toString)

}
