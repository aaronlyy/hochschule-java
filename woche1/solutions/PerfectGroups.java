import java.util.Scanner;

public class PerfectGroups {
  public static void main(String[] args) {
    // create scanner object
    Scanner scanner = new Scanner(System.in);

    int personCount = 0;

    while (true) {
      System.out.print("Anzahl Personen: ");

      // check if input is int
      if (scanner.hasNextInt()) {

        // get int from input
        personCount = scanner.nextInt();
        break;
      }
      else {
        System.out.println("Bitte gebe eine gültige Zahl ein.");
        
        // try again ;-;
        scanner.next();
        continue;
      }
    }

    // get possible groups with 2 persons + use modulo to get possible remaining persons
    int possibleGroups = personCount / 2;
    int remaining = personCount % 2;

    if (remaining == 1) {
      // add 1 to possibleGroups to create group for the remaining person
      possibleGroups += 1;
    }
    else {
      // print if there are no remaining persons
      System.out.println("Perfekte Aufteilung!");
    }
    
    // print possible groups
    System.out.printf("Die Personen können in %d Gruppen aufgeteilt werden.", possibleGroups);

    // close scanner
    scanner.close();
  }
}