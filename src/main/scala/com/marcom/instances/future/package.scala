package com.marcom.instances

import cats.Functor

import scala.concurrent.{ExecutionContext, Future}

package object future {

  implicit def functor(implicit ctx:ExecutionContext) : Functor[Future] = new Functor[Future]{
    override def map[A, B](fa: Future[A])(f: A => B) = fa.map(f)
  }

}
