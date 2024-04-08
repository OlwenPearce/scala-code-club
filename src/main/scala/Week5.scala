object Week5 {


  def getSoilValues(destination: Int, source: Int, rangeLength: Int): List[(Int,Int)] = {
    val range = 1 to rangeLength

    range.map(r => (source + r - 1, destination + r - 1)).toList
  }

}
