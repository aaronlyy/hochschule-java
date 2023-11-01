import java.util.Scanner;

public class ForeverYoung {
  public static void main(String[] args) {
    System.out.print("Ihr Alter: ");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

    if (age < 10) {
      System.out.println("Echt jetzt? Wow.");
    }
    else if (age >= 10 && age <= 20) {
      System.out.println("Midlife-Crisis ist für Dich ein Fremdwort, nehme ich an.");
    }
    else {
      System.out.println("Weisheit reift mit dem Alter, schätze ich.");
    }

    // close scanner
    in.close();
  }
}
