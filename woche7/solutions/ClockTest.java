public class ClockTest {
  public static void main(String[] args) {
    Clock basicClock = new Clock();
    basicClock.print();
    basicClock.tick();
    basicClock.print();
    for (int i = 1; i <= 12; i++) {
      basicClock.tick();
    }
    basicClock.print();
    basicClock.switchMode();
    basicClock.print();
    for (int i = 1; i <= 10; i++) {
      basicClock.tick();
    }
    basicClock.print();
    basicClock.switchMode();
    basicClock.print();
    basicClock.switchToSummertime();
    basicClock.print();
    basicClock.tick();
    basicClock.print();
    basicClock.switchToWintertime();
    basicClock.print();
    basicClock.switchMode();
    basicClock.print();
  }
}