package hw1;

public class RomeDigits {

  public String parseToRomeDigit(int value) {

    if (value > 100 || value <= 0) {
      throw new IllegalArgumentException("Wrong value, please select from 1 - 100");
    }

    StringBuilder result = new StringBuilder();
    String str = String.valueOf(value);

    if (str.length() == 3) {
      return "C";
    }

    String[] array = str.split("");

    int[] digits = str.length() == 2 ? new int[2] : new int[1];

    for (int i = 0; i < digits.length; i++) {
      digits[i] = Integer.parseInt(array[i]);
    }

    if (str.length() == 2) {
      switch (digits[0]) {
        case 1:
          result.append("X");
          break;
        case 2:
          result.append("XX");
          break;
        case 3:
          result.append("XXX");
          break;
        case 4:
          result.append("XL");
          break;
        case 5:
          result.append("L");
          break;
        case 6:
          result.append("LX");
          break;
        case 7:
          result.append("LXX");
          break;
        case 8:
          result.append("LXXX");
          break;
        case 9:
          result.append("XC");
          break;
      }
    }

    int mark = digits.length == 2 ? 1 : 0;

    switch (digits[mark]){
      case 1:
        result.append("I");
        break;
      case 2:
        result.append("II");
        break;
      case 3:
        result.append("III");
        break;
      case 4:
        result.append("IV");
        break;
      case 5:
        result.append("V");
        break;
      case 6:
        result.append("VI");
        break;
      case 7:
        result.append("VII");
        break;
      case 8:
        result.append("VIII");
        break;
      case 9:
        result.append("IX");
        break;
    }

    return result.toString();
  }
}
