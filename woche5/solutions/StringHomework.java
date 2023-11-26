import java.util.Arrays;

public class StringHomework {

  public static void main(String[] args) {

    if (isPalindrome("Legovogel")){
      System.out.println("Ist ein Palindrom");
    }

    if (checkForAnagram("tom marvolo riddle", "i am lord voldemort")) {
      System.out.println("Ist ein Anagramm");
    }
  }

  public static boolean isPalindrome(String s) {
    return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
  }

  public static boolean checkForAnagram(String s1, String s2) {
    s1 = s1.replaceAll("\\s+", "");
    s2 = s2.replaceAll("\\s+", "");

    if (s1.length() != s2.length()) {
      return false;
    }

    // hätte man auch einfach so lösen können aber war ja nicht erlaubt :(
    // char[] charArray1 = s1.toCharArray();
    // char[] charArray2 = s2.toCharArray();

    char[] s1Arr = new char[s1.length()];
    char[] s2Arr = new char[s2.length()];

    for (int i = 0; i < s1.length(); i++) {
      s1Arr[i] = s1.charAt(i);
    }

    for (int i = 0; i < s2.length(); i++) {
      s2Arr[i] = s2.charAt(i);
    }

    Arrays.sort(s1Arr);
    Arrays.sort(s2Arr);

    return Arrays.equals(s1Arr, s2Arr);
  }
}
