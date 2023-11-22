package woche4.solutions;
public class Methods {
  public static void main(String[] args) {
    add(3,2,1,6);
  }

  // euclidian algorithm to get the greatest common factor
  public static int greatestCommonFactor(int a, int b) {
    int oldA;
    while (b != 0) {
      oldA = a;
      a = b;
      b = oldA % b;
    }
    return a;
  }

  // divide with ggt
  public static void printReduced(int counter, int denominator) {
    int ggt = greatestCommonFactor(counter, denominator);
    System.out.printf("%d/%d", counter / ggt, denominator / ggt);
  }

  public static void add(int counter1, int denominator1, int counter2, int denominator2) {
    counter1 = counter1 * denominator2;
    counter2 = counter2 * denominator1;

    int denominator = denominator1 * denominator2;
    int counter = counter1 + counter2;

    printReduced(counter, denominator);
  }
}

