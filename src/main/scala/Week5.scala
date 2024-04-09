case class Variable(
    parameterMap: Map[Int, Int]
                   ) {
  def getParameterValue(key: Int): Int = {
    this.parameterMap.getOrElse(key, key)
  }
}

object Variable{
  def apply(ranges: List[String]): Variable = {
    val values = ranges.flatMap(section => createMap(section).toList).toMap

    Variable(values)
  }

  private def createMap(ranges: String): IndexedSeq[(Int, Int)] = {
    val parts = ranges.split(" ")

    val destination: Int = Integer.parseInt(parts(0))
    val source: Int = Integer.parseInt(parts(1))
    val rangeLength: Int = Integer.parseInt(parts(2))

    val range = 1 to rangeLength

    range.map(r => (source + r - 1, destination + r - 1))
  }
}

object Week5 {

}
