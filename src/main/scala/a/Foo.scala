package a

import java.lang.System
import scala.{StringContext,Unit}
import scala.reflect.runtime.universe._
import scala.util.{Success,Try}
import scala.Predef.String

object Foo {

  def hello[D <: Data]
  (d: D)
  (implicit t: TypeTag[D])
  : Try[String]
  = Success(t.tpe.termSymbol.fullName)

}
