object Week2 {
 def isGamePossible(cubes: Array[String]): Boolean = {
   cubes.map(colour => isColourPossible(colour))
     .filter(result => result == false).length > 0

 }

  def isColourPossible(colour: String): Boolean = {
    val Red = "([0-9]*) (red)".r
    val Green = "([0-9]*) (green)".r
    val Blue = "([0-9]*) (blue)".r
    //12 red cubes, 13 green cubes, and 14 blue cubes
    colour match {
      case Red(amount) if Integer.parseInt(amount) <= 12 =>  true
      case Green(amount) if Integer.parseInt(amount) <= 13 =>  true
      case Blue(amount) if Integer.parseInt(amount) <= 14 =>  true
      case _ => false
    }

  }
}
