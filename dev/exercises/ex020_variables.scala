object General:

  var age = 20
  var showAge: Boolean = false
  var name: String = "Hans" // always use double quotes for String
  var letter: Char = 'H' // always use single quotes for Char
  var rank:Float = 3.2f
  var ranking:Double = 3.2 // more common than Float

  def main(args: Array[String]): Unit =
    if (showAge) {
      println("He is " + age + " years old.")
    } else {
      println("didn't show age")
    }
    println("Name: " + name)
    println("Letter: " + letter)
    println("Rank: " + rank)
    println("R: " + ranking)
