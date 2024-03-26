import org.scalatest.funsuite.AnyFunSuiteLike

class Week3Test extends AnyFunSuiteLike {

//    The engine schematic (your puzzle input) consists of a visual
  //    representation of the engine. There are lots of numbers and symbols you don't really
  //    understand, but apparently any number adjacent to a symbol, even diagonally,
  //    is a "part number" and should be included in your sum.
  //    (Periods (.) do not count as a symbol.)
//
//  Here is an example engine schematic:
  val schematic = List(
    "467..114..", //114 is not a part number because it is not adjacent to a symbol
    "...*......",
    "..35..633.",
    "......#...",
    "617*......",
    ".....+.58.", //58 is not a part number because it is not adjacent to a symbol
    "..592.....",
    "......755.",
    "...$.*....",
    ".664.598.."
  )
//  In
//  this schematic
//  , two numbers are not part numbers because they are not adjacent to a symbol: 114
//  (top right) and 58(middle right).Every other number is adjacent to a symbol and so is a part number;
//  their sum is
//  4361.
//
//  Of course
//  , the actual engine schematic is much larger.What is the sum of all of the part numbers in the engine schematic ?
  test("part numbers") {

  }


}
