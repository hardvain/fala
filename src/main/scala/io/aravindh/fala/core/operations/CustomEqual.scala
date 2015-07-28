package io.aravindh.fala.core.operations

import io.aravindh.fala.core.typeclasses.Eq

object CustomEqual {
  def areEqual[A](a:A,b:A)(implicit evidence:Eq[A]) = evidence.===(a,b)
}
