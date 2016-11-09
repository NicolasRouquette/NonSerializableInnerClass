package a

import scala.util.{Success, Try}

object Wrapper {

  def toTry[U,V]
  (f: U => V)
  (u: U)
  : Try[V]
  = Success(f(u))

}
