object Week5 {


  def createMap(destination: Int, source: Int, rangeLength: Int): Map[Int, Int] = {
    val range = 1 to rangeLength

    range.map(r => (source + r - 1, destination + r - 1)).toMap
  }

}
