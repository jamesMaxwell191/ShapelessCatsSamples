package com.marcom.core

trait Printable[A] {

  def format(a:A): String

}

object Printable{

  def apply[A](implicit ev:Printable[A]) = ev

  def instance[A](f:A => String): Printable[A] = new Printable[A] {
    override def format(a: A): String = f(a)
  }

  def print[A](a:A)(implicit ev: Printable[A]) = ev.format(a)
}
