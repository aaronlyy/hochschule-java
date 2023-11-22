public class Methods {
  public static void main(String[] args) {

    System.out.println(greatestCommonFactor(12, 98));
    System.out.println(greatestCommonFactor(77, 34));
    System.out.println(greatestCommonFactor(45, 103));
    System.out.println(greatestCommonFactor(88,77));

    printReduced(55, 87);
    printReduced(46, 88);
    printReduced(78, 23);
    printReduced(63, 19);

    add(3,2,1,6);
    add(34,12,5,30);
    add(45,90,20,26);
    add(4,12,3,18);
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
    System.out.printf("%d/%d\n", counter / ggt, denominator / ggt);
  }

  public static void add(int counter1, int denominator1, int counter2, int denominator2) {
    counter1 = counter1 * denominator2;
    counter2 = counter2 * denominator1;

    int denominator = denominator1 * denominator2;
    int counter = counter1 + counter2;

    printReduced(counter, denominator);
  }
}

