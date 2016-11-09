package a

import scala.{StringContext, Unit}
import scala.Predef.String
import scala.util.{Failure, Success}

object Bar {

  def world1(): Unit = {
    val r = new Invocable() {

      override def run(d: Data): Unit = {
        for {
          _ <- Foo.hello(d)
        } ()

      }
    }
    val d: Data = scala.Predef.???
    r.run(d)
  }

  def world2(): Unit = {
    val d: Data = scala.Predef.???
    for {
      _ <- Foo.hello(d)
    } ()
  }

  def world3(): Unit = {
     val r = new Invocable() {

      override def run(d: Data): Unit = {
        Wrapper.toTry
        { (x: Data) =>
          for {
            _ <- Foo.hello(x)
          } ()
        }(d) match {
          case Failure(t) =>
            throw t
          case Success(_) =>
            ()
        }
      }
    }
    val d: Data = scala.Predef.???
    r.run(d)
  }
}
