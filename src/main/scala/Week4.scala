case class Card (
  winningNumbers: Array[Int],
  heldNumbers: Array[Int]
)
object Week4 {

  def pointsForPile(cardStrings: List[String]): Int = {
    val cards = cardStrings.map(card => toCard(card))
    val winners = cards.map(card => getWinners(card))
    val points = winners.map(winners => getPoints(winners))

    points.sum
  }

  def toCard(card: String): Card = {
     def toNumbers(numbers: String): Array[Int] = numbers
       .split(" ").filter(number => number.nonEmpty)
       .map(number => Integer.parseInt(number))

     val sections = card.split("\\|")

    val winningNumbers = toNumbers(sections(0))
    val heldNumbers = toNumbers(sections(1))

    Card(winningNumbers, heldNumbers)
  }

  def getWinners(card: Card): Array[Int] = {
    card.heldNumbers.filter(number => card.winningNumbers.contains(number))
  }

  def getPoints(winners: Array[Int]): Int = {
    if (winners.length < 1) {
      return 0
    }
    scala.math.pow(2, winners.length - 1).toInt
  }

}
