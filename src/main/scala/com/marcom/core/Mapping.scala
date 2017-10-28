package com.marcom.core

trait Mapping[A,B] {

  def map(a:A): B

}

object Mapping {

  def apply[A,B](implicit ev: Mapping[A,B]) = ev

  def instance[A,B](f:A => B): Mapping[A,B] = new Mapping[A,B]{
    override def map(a: A) = f(a)
  }
}
