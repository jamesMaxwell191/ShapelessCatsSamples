package com.marcom.syntax

import com.marcom.core.Printable

package object printable {

  implicit class PrintableOps[A](a:A){
     def print(implicit ev: Printable[A]): String = ev.format(a)
  }

}
