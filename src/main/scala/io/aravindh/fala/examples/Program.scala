package io.aravindh.fala.examples

import io.aravindh.fala.core.operations.CustomEqual
import io.aravindh.fala.core.typeclasses.Eq

object Program extends App{
  println(CustomEqual.areEqual(1,1))
  implicit val PersonEq : Eq[Person] = new Eq[Person]{
    override def ===(a: Person, b: Person): Boolean = a.name == b.name
  }

  println(CustomEqual.areEqual(Person("1"),Person("1")))
}

case class Person(name:String)
