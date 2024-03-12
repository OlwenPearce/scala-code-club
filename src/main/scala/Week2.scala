import java.lang.Character.isDigit

object Week2 {

  def sumOfIdsWhichArePossible(games: List[String]): Int = {
    games.map(game => isPossibleForGameId(game))
      .filter(result => result._2)
      .map(result => result._1)
      .sum
  }


  def isPossibleForGameId(idAndGameString: String): (Int, Boolean) = {
    val idAndGame = idAndGameString.split(": ")

    val id = Integer.parseInt(idAndGame.head.filter(char => isDigit(char)))

    //todo - nicer
    val game = idAndGame.tail.head.split("[,;] ")

   (id,isGamePossibleForCubes(game))
  }

 def isGamePossibleForCubes(cubes: Array[String]): Boolean = {
   cubes.forall(colour => isColourPossible(colour))
 }

  def isColourPossible(colour: String): Boolean = {
    //todo - if I can get this regex matching to work the parse int can't blow up
//    val Red = "(.)([0-9]*) (red)".r
//    val Green = "(.)([0-9]*) (green)".r
//    val Blue = "(.)([0-9]*) (blue)".r
    //12 red cubes, 13 green cubes, and 14 blue cubes
    colour match {
      case s"$amount red" if Integer.parseInt(amount) <= 12 => true
      case s"$amount green" if Integer.parseInt(amount) <= 13 =>  true
      case s"$amount blue" if Integer.parseInt(amount) <= 14 =>  true
      case _ => false
    }

  }
}
