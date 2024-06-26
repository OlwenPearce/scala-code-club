import org.scalatest.funsuite.AnyFunSuiteLike

class Week5Test extends AnyFunSuiteLike {
//  The almanac (your puzzle input) lists all of the seeds that need to be planted.
  //  It also lists what type of soil to use with each kind of seed, what type of fertilizer
  //  to use with each kind of soil, what type of water to use with each kind of fertilizer, and so on.
  //
  //  Every type of seed, soil, fertilizer and so on is identified with a number,
  //  but numbers are reused by each category - that is, soil 123 and fertilizer 123 aren't
  //  necessarily related to each other.

  //  The almanac starts by listing which seeds need to be planted
  val seeds = "79 14 55 13"

  //  The rest of the almanac contains a list of maps which describe how to convert numbers from a
  //  source category into numbers in a destination category

  //describes how to convert a seed number (the source) to a soil number(the destination).
  //the maps describe entire ranges of numbers that can be converted
  val seedToSoilMap = List(
    //Each line within a map contains three numbers:
    // the destination range start
    // the source range start
    // and the range length
    "50 98 2",
    "52 50 48"
  )


  val soilToFertilizerMap = List("0 15 37","37 52 2","39 0 15")

  val fertilizerToWaterMap = List("49 53 8","0 11 42","42 0 7","57 7 4")

  val waterToLightMap = List("88 18 7","18 25 70")

  val lightToTemperatureMap = List("45 77 23","81 45 19","68 64 13")

  val temperatureToHumidityMap = List("0 69 1","1 0 69")

  val humidityToLocationMap = List("60 56 37","56 93 4")



//.That is
//  , the section that starts
//  with seed - to - soil map:
//  This lets the gardener and his team know which soil to use
//  with which seeds
//  , which water to use
//  with which fertilizer
//  , and so on.
//
//    Rather than list every source number and its corresponding destination number one by one
//  , .
//  , the source range start
//  ,
//.

  test("makes map and gets values") {
    //The first line has a destination range start of 50, a source range start of 98, and a range length of 2.
    val resultSeedToSoilMap = Variable.apply(seedToSoilMap)

    // With this information, you know that seed number 98 corresponds to soil number 50
    //    Any source numbers that aren 't mapped correspond to the same destination number
    //  .So , seed number 10 corresponds to soil number 10.
    assert(resultSeedToSoilMap.getParameterValue(98) === 50)
    assert(resultSeedToSoilMap.getParameterValue(52) === 54)
    assert(resultSeedToSoilMap.getParameterValue(10) === 10)
  }

//  The gardener and his team want to get started as soon as possible
//  , so they 'd like to know the closest location that needs a seed.Using these maps
//  , find the lowest location number that corresponds to any of the initial seeds.To
//  do this, you'll need to convert each seed number through other categories until
//  you can find its corresponding location number

  val maps = List(
    seedToSoilMap,
    soilToFertilizerMap,
    fertilizerToWaterMap,
    waterToLightMap,
    lightToTemperatureMap,
    temperatureToHumidityMap,
    humidityToLocationMap
  )

  val variables: List[Variable] = maps.map(m => Variable(m))

  test("get location") {
    assert(Week5.getLocationForSeed(variables, 79) === 82)
    assert(Week5.getLocationForSeed(variables, 14) === 43)
    assert(Week5.getLocationForSeed(variables, 55) === 86)
    assert(Week5.getLocationForSeed(variables, 13) === 35)

  }

  test("get lowest location"){
    assert(Week5.getLowestLocationForSeeds(variables, List(79,14,55,13)) === 35)
  }




}
