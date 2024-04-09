case class Variable(
    parameterMap: Map[Int, Int]
                   ) {
  def getParameterValue(key: Int): Int = {
    this.parameterMap.getOrElse(key, key)
  }
}

object Variable{
  def apply(ranges: String): Variable = {
    val parts = ranges.split(" ")

    val destination: Int = Integer.parseInt(parts(0))
    val source: Int = Integer.parseInt(parts(1))
    val rangeLength: Int = Integer.parseInt(parts(2))

    val range = 1 to rangeLength

    Variable(range.map(r => (source + r - 1, destination + r - 1)).toMap)
  }
}

object Week5 {

}
