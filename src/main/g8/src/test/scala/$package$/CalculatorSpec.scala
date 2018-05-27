package $package$

import org.specs2.mutable._
import cats._
import cats.implicits._

class CalculatorSpec extends Specification {
  "Calculator.add" should {
    "add things" in {
      Calculator.add(1, 2) ==== 3
    }
  }
}
