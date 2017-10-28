package com.marcom.instances

import com.marcom.ap.ApplicationContext
import com.marcom.core.{Mapping, Printable}

package object integer {

  implicit val print:Printable[Int] = Printable.instance(_.toString)

  implicit def stringMapping(implicit ctx:ApplicationContext): Mapping[Int,String] = Mapping.instance(_.toString)

}
