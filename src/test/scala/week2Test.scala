import org.scalatest.funsuite.AnyFunSuiteLike

class week2Test extends AnyFunSuiteLike {
  //Each game is listed with its ID number (like the 11 in Game 11: ...) followed by a semicolon-separated list of subsets of cubes that were revealed from the bag (like 3 red, 5 green, 4 blue)
  //which games would have been possible if the bag contained only
  // 12 red cubes, 13 green cubes, and 14 blue cubes

//  Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green => possible, ID 1
//    Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue => possible, ID 2
//    Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
//    Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
//    Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green => possible, ID 5
  // x (Game 1) + y (Game 2) + z (Game 3) = 8\

  test("isGamePossible") {
    assert(Week2.isGamePossible("3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green") === true)
    assert(Week2.isGamePossible("1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red") === false)
  }


}
