package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomeDigitsTest {

  @Test
  public void testRomeDigitParserWithOneDigit() throws Exception {

    //phase 1
    RomeDigits parser = new RomeDigits();

    int check = 3;
    int check2 = 5;
    int check3 = 9;

    //phase 2
    String result = parser.parseToRomeDigit(check);
    String result2 = parser.parseToRomeDigit(check2);
    String result3 = parser.parseToRomeDigit(check3);

    //phase 3
    assertEquals("III", result);
    assertEquals("V", result2);
    assertEquals("IX", result3);

  }

  @Test
  public void testRomeDigitParserWithTwoDigit() throws Exception {

    //phase 1
    RomeDigits parser = new RomeDigits();

    int check = 24;
    int check2 = 42;
    int check3 = 99;

    //phase 2
    String result = parser.parseToRomeDigit(check);
    String result2 = parser.parseToRomeDigit(check2);
    String result3 = parser.parseToRomeDigit(check3);

    //phase 3
    assertEquals("XXIV", result);
    assertEquals("XLII", result2);
    assertEquals("XCIX", result3);

  }

  @Test
  public void testRomeDigitParserWithThreeDigit() throws Exception {

    //phase 1
    RomeDigits parser = new RomeDigits();
    int check = 100;

    //phase 2
    String result = parser.parseToRomeDigit(check);

    //phase 3
    assertEquals("C",result);

  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadParamsForRoomParser1() throws Exception {

    //phase 1
    RomeDigits parser = new RomeDigits();

    int check = 123;

    //phase 2,3
    String result = parser.parseToRomeDigit(check);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadParamsForRoomParser2() throws Exception {

    //phase 1
    RomeDigits parser = new RomeDigits();
    int check = 0;

    //phase 2,3
    String result = parser.parseToRomeDigit(check);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadParamsForRoomParser3() throws Exception {

    //phase 1
    RomeDigits parser = new RomeDigits();
    int check = -23;

    //phase 2,3
    String result = parser.parseToRomeDigit(check);
  }



}