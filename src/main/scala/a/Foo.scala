package a

import java.lang.System
import scala.{StringContext,Unit}
import scala.Predef.String

object Foo {

  def hello(s: String): Unit = {
    System.out.println(s"Hello $s")
  }

}
