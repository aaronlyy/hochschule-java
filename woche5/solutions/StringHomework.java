public class StringHomework {

  public static void main(String[] args) {
    System.out.println(isPalindrome("Abba"));
    System.out.println(isPalindrome("Legovogel"));
    System.out.println(checkForAnagrams("betruG", "Geburt"));
    System.out.println(checkForAnagrams("tom marvolo riddle", "i am lord voldemort"));
  }

  public static boolean isPalindrome(String s) {
    // check if s is empty
    if (s == "") {
      return false;
    }

    // remove spaces and ignore case
    s = s.replaceAll("\\s", "").toLowerCase();

    // loop throug string till half of it from both sides and compare chars
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false;
      }
    }

    return true;
  }

  public static boolean checkForAnagrams(String s1, String s2) {
    // check if strings are empty
    if (s1 == "" || s2 == "") {
        return false;
    }

    // removed spaces
    s1 = s1.replaceAll("\\s+", "");
    s2 = s2.replaceAll("\\s+", "");

    // check if strings are same length
    if (s1.length() != s2.length()) {
        return false;
    }

    // create char array (ASCII)
    int[] charCounts = new int[256];

    // count chars
    for (int i = 0; i < s1.length(); i++) {
        charCounts[s1.charAt(i)]++;
        charCounts[s2.charAt(i)]--;
    }

    // check if every char is 0
    for (int count : charCounts) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }
}