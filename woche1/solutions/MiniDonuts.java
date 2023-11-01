import java.util.Scanner;

public class MiniDonuts {
  public static void main(String args[]) {
    // create scanner instance
    
    Scanner scanner = new Scanner(System.in);

    // get inputs from console
    int small = getIntSafe("Small: ", scanner);
    int big = getIntSafe("Big: ", scanner);
    int n = getIntSafe("Donuts: ", scanner);

    // get possible big packs


    // close scanner
    scanner.close();

  }

  private static int getIntSafe(String prompt, Scanner scanner) {
    int number = 0;
    while (true) {
      System.out.println(prompt);
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