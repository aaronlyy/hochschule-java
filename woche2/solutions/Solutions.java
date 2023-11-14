public class Solutions {
    public static void main(String[] args) {

        // equation = x3 - 73x2 + 1655x - 11951 = 0

        for (int x = 1; x < 100; x++) {
            int solution = (x * x * x) - (73 * x * x) + (1655 * x) - 11951;
            if (solution == 0) {
                System.out.println(x);
            }
        }
    }
}