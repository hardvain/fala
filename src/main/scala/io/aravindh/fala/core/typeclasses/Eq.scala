package io.aravindh.fala.core.typeclasses

trait Eq[A] { self =>
  def ===(a: A, b: A): Boolean

  def !==(a: A, b: A): Boolean =  ===(a,b)
}

object Eq{
  implicit val IntEq = new Eq[Int]{
    override def ===(a: Int, b: Int): Boolean = a == b
  }
}