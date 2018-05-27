package $package$

import cats._
import cats.implicits._

object Calculator {
  def add[A](x: A, y: A)(implicit monoid: Monoid[A]): A = {
    monoid.combine(x, y)
  }
}
