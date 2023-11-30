package woche6.solutions;

public class CeasarsCode {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Missing text and key arguments");
      return;
    }

    String keyPhrase = args[0];
    String text = args[1];

    char[] key = getKey(keyPhrase);

    System.out.println(encrypt(text, key));
    System.out.println(decrypt(encrypt(text, key), key));
  }

  public static char[] getKey(String keyPhrase) {
    // return char array with chars 65 - 90 replaced by keyPhrase
    // check if keyPhrase length is 26
    if (keyPhrase.length() != 26) {
      return null;
    }

    // create char array from keyPhrase
    char[] replaceKeys = keyPhrase.toCharArray();

    // create new char array & fill it with chars
    char[] key = new char[256];
    for (char c = 0; c < 256; c++) {
      key[c] = c;
    }

    // replace index 65 - 90 with keyPhrase array
    System.arraycopy(replaceKeys, 0, key, 65, 26);

    return key;
  }

  public static String encrypt(String text, char[] key) {
    // create char array from given string
    char[] tArr = text.toCharArray();

    // iterate through array and replace chars with key chars
    for (int c = 0; c < tArr.length; c++) {
      tArr[c] = key[tArr[c]];
    }

    // convert char array back to string
    return new String(tArr);
  }

  public static String decrypt(String cipher, char[] key) {
    // create char array of cipher and stringbuilder to append every character
    char[] cArr = cipher.toCharArray();

    // iterate through cipher, search char in key char and replace char with found index
    // a hashmap would be more efficient, but not allowed :(
    for (int i = 0; i < cArr.length; i++) {
      // find char in key array
      for (char j = 0; j < key.length; j++) {
        if (key[j] == cArr[i]) {
          // add found char to result
          cArr[i] = j;
          break;
        }
      }
    }
    return new String(cArr);
  }
}
