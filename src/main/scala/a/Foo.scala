package a

import java.lang.System
import scala.{StringContext,Unit}
import scala.util.{Success,Try}
import scala.Predef.String

object Foo {

  def hello(s: String): Try[String] = {
    val m = s"Hello $s"
    System.out.println(m)
    Success(m)
  }

}
