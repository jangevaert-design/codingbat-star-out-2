public class StarOut2 {
  public String starOut(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      if (i == 0 && str.charAt(i) != '*') {
        result += str.charAt(i);
      }

      if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
        result += str.charAt(i);
      }

      if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
        result = result.substring(0,result.length()-1);
      }
    }
    return result;
  }
}
