package a

import java.lang.{Runnable, System}

import scala.{StringContext, Unit}
import scala.Predef.String
import scala.util.{Failure, Success}

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

  def world3(): Unit = {
     val r = new Runnable() {

      override def run(): Unit = {
        Wrapper.toTry
        { (s: String) =>
          Foo.hello(s)
        }("world1") match {
          case Failure(t) =>
            throw t
          case Success(_) =>
            ()
        }
      }
    }
    r.run()
  }
}
