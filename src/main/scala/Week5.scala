object Week5 {


  def createMap(ranges: String): Map[Int, Int] = {
    val parts = ranges.split(" ")

    val destination: Int = Integer.parseInt(parts(0))
    val source: Int = Integer.parseInt(parts(1))
    val rangeLength: Int = Integer.parseInt(parts(2))

    val range = 1 to rangeLength

    range.map(r => (source + r - 1, destination + r - 1)).toMap
  }

  def getValueFromMap(map: Map[Int, Int], key: Int): Int = {
    map.getOrElse(key, key)
  }

}
