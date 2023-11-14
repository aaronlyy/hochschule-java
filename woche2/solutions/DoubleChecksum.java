import java.util.Scanner;

public class DoubleChecksum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = getIntSafe("Zahl: ", scanner);
    scanner.close();

    int checksum = 0;
    int remaining;

    while (n > 0) {
      remaining = n % 100;
      n /= 100;
      checksum += remaining;
    }

    System.out.println(checksum);
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