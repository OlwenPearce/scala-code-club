object Week2 {

  def isGamePossible(game: String): Boolean = {
    val cubes = game.split("[,;] ")

    isGamePossibleForArray(cubes)
  }

 def isGamePossibleForArray(cubes: Array[String]): Boolean = {
   !cubes.map(colour => isColourPossible(colour)).contains(false)
 }

  def isColourPossible(colour: String): Boolean = {
    //todo - if I can get this regex matching to work the parse int can't blow up
    val Red = "(.)([0-9]*) (red)".r
    val Green = "(.)([0-9]*) (green)".r
    val Blue = "(.)([0-9]*) (blue)".r
    //12 red cubes, 13 green cubes, and 14 blue cubes
    colour match {
      case s"$amount red" if Integer.parseInt(amount) <= 12 => true
      case s"$amount green" if Integer.parseInt(amount) <= 13 =>  true
      case s"$amount blue" if Integer.parseInt(amount) <= 14 =>  true
      case _ => {
        println(s"no match for ${colour}")
        false
      }
    }

  }
}
