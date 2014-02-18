import scala.reflect.macros.whitebox._
import scala.language.experimental.macros

object Macros {
  def impl(c: Context)(x: c.Tree) = {
    ???
  }

  def gen(x: String): Any = macro impl
}