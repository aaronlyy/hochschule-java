public class EvenSumDicePairs {
  public static void main(String[] args) {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if ((i + j) % 2 == 0 && i <= j) {
          System.out.printf("%d, %d (%d+%d=%d & %d<=%d)\n", i, j, i, j, i + j, i, j);
        }
      }
    }
  }
}
