import java.lang.Math;

public class LogarithmTwo {
  public static void main(String[] args) {

    double diff;
    double solution = 0.6931471805599453094172321214581f;
    double y = 1f;
    double divider = 2f;
    int counter = 1;

    do {
      y = y + (1 / divider) * Math.pow(-1, divider - 1);
      divider++;
      counter++;

      System.out.printf("Step %d: %f (diff: %f)\n", counter, y, solution - y);

      diff = Math.sqrt(Math.pow(solution - y, 2));
    }
    while (diff > 0.0023f);

    System.out.printf("Acutal Math.log(2): %f", Math.log(2));

  }
}