import org.scalatest.funsuite.AnyFunSuiteLike

class week1Test extends AnyFunSuiteLike {
  test("getCalibrationValue") {
    //1abc2 => 12
    //pqr3stu8vwx = 38
    //a1b2c3d4e5f = 15
    //treb7uchet = 77
    assert(Week1.getCalibrationValue("1abc2") === 12)
    assert(Week1.getCalibrationValue("pqr3stu8vwx") === 38)
    assert(Week1.getCalibrationValue("a1b2c3d4e5f") === 15)
    assert(Week1.getCalibrationValue("treb7uchet") === 77)
  }

}
