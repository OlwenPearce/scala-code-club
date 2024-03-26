object Week4 {

//  def toCard(card: String): (List[Int], List[Int]) {
//
//  }

  def getWinners(winningNumbers: List[Int], numbersOnCard: List[Int]): List[Int] = {
    numbersOnCard.filter(number => winningNumbers.contains(number))
  }

}
