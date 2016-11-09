package a

import java.lang.{Runnable, System}

import scala.{StringContext, Unit}
import scala.Predef.String
import scala.util.{Failure, Success}

object Bar {

  def world1(): Unit = {
    val r = new Runnable() {

      override def run(): Unit = {
        for {
          _ <- Foo.hello("world1")
        } ()

      }
    }
    r.run()
  }

  def world2(): Unit = {
    for {
      _ <- Foo.hello("world2")
    } ()
  }

  def world3(): Unit = {
     val r = new Runnable() {

      override def run(): Unit = {
        Wrapper.toTry
        { (s: String) =>
          for {
            _ <- Foo.hello(s)
          } ()
        }("world3") match {
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
