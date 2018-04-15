package week5day2_TestNG_2XML;

import org.testng.annotations.Test;

public class TestNG_SC06_TC01_Factories {
  @Test(parameters = { "number-of-times" })
  public void accessPage(int numberOfTimes) {
    while (numberOfTimes-- > 0) {
     // access the web page
    }
  }
}