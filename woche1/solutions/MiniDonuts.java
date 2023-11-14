import java.util.Scanner;

public class MiniDonuts {
  public static void main(String args[]) {
    // create scanner instance
    Scanner scanner = new Scanner(System.in);

    // get inputs from console
    int packsSmall = getIntSafe("Anzahl kleine Packungen: ", scanner);
    int packsBig = getIntSafe("Anzahl große Packungen: ", scanner);
    int n = getIntSafe("Wieviele Donuts willst du kaufen?: ", scanner);

    // calculate packs
    int actualBigPacks;
    int remainingBigPacks;
    int neededBigPacks = n / 5;

    int neededSmallPacks = n % 5;
    int actualSmallPacks;

    if (neededBigPacks > packsBig) {
      actualBigPacks = packsBig;
      remainingBigPacks = neededBigPacks - packsBig;
      neededSmallPacks += remainingBigPacks * 5;
    }
    else {
      actualBigPacks = neededBigPacks;
    }

    if (neededSmallPacks > packsSmall) {
      System.out.println("Nicht möglich");
      return;
    }
    
    actualSmallPacks = neededSmallPacks;

    // print packs
    System.out.printf("Verkauft werden %d große Packungen und %d kleine Packungen", actualBigPacks, actualSmallPacks);

    // close scanner
    scanner.close();

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