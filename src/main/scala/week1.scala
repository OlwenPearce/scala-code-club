//  The newly-improved calibration document consists of lines of text;
//  each line originally contained a specific calibration value that the Elves now need to recover.
//  On each line, the calibration value can be found by combining the first digit and the last digit
//  (in that order) to form a single two-digit number.
//
//For example:
//
//1abc2 => 12
//pqr3stu8vwx = 38
//a1b2c3d4e5f = 15
//treb7uchet = 77
//In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.
//
//Consider your entire calibration document. What is the sum of all of the calibration values?

object Week1 {
  def getCalibrationValue(docLine: String): Int = {
    //remove items which are not digits
    val docNumbers = docLine.filter(char => Character.isDigit(char))
    //concat first and last digits
    if (docNumbers.length < 1) { return 0 }
    val stringVal = docNumbers.substring(0, 1) + docNumbers.substring(docNumbers.length - 1)
    //convert to number
    Integer.parseInt(stringVal)
  }

}
