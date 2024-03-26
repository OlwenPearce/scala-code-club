case class Card (
  winningNumbers: Array[Int],
  heldNumbers: Array[Int]
)
object Week4 {

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

}
