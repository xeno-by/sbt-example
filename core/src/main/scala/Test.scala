object Test extends App {
  println(Macros.gen("x").x)
  println(Macros.gen("y").y)
}