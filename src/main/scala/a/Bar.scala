package a

import java.lang.{Runnable,System}
import scala.{StringContext,Unit}
import scala.Predef.String

object Bar {

  def world1(): Unit = {
    val r = new Runnable() {

      override def run(): Unit = {
        Foo.hello("world1")
      }
    }
    r.run()
  }

  def world2(): Unit = {
    Foo.hello("world2")
  }
}
