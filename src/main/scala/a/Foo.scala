package a

import java.lang.System
import scala.{StringContext,Unit}
import scala.util.{Success,Try}
import scala.Predef.String

object Foo {

  def hello(d: Data): Try[String] = {
    Success(d.toString)
  }

}
