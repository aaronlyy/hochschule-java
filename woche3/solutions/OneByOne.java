import java.util.Scanner;

public class OneByOne {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = getIntSafe("Zahl: ", scanner);
    scanner.close();

    int count = 0;

    while (n != 0) {
      count += n & 1;
      n >>= 1;
      System.out.printf(
        "%32s\n%32s\n--------------------------------\n%32s\nCurrent count: %d\n\n",
        Integer.toBinaryString(1), Integer.toBinaryString(n), Integer.toBinaryString(n & 1), count
        );
    }
    System.out.printf("Set bits: %d\n", count);
  }

  private static int getIntSafe(String prompt, Scanner scanner) {
    int number = 0;
    while (true) {
      System.out.print(prompt);
      if (scanner.hasNextInt()) {
        number = scanner.nextInt();
        break;
      }
      System.out.println("Bitte gebe eine gültige Zahl ein.");
      scanner.next();
    }
    return number;
  }
}
