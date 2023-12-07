public class Clock {

  int hour;
  boolean modeAmPm;
  boolean summer;
  boolean winter;

  public Clock() {
    this.hour = 0;
    this.modeAmPm = false;
    this.summer = false;
    this.winter = true;
  }

  /**
   * Add one hour
   */
  private void addHour() {
    if (this.hour == 23) {
      this.hour = 0;
    }
    else {
      this.hour++;
    }
  }

  /**
   * Subtract one hour
   */
  private void subtractHour() {
    if (this.hour == 0) {
      this.hour = 23;
    }
    else {
      this.hour--;
    }
  }

  /**
   * Converts current time to a 12h format string
   */
  private String getAmPmString() {
    int hourAmPm;
    String suffix;

    // get suffix
    if (this.hour > 12) {
      suffix = "pm";
    }
    else {
      suffix = "am";
    }

    // convert 24h to 12h format
    if (this.hour - 12 < 0) {
      hourAmPm = this.hour + 12;
    }
    else {
      hourAmPm = this.hour - 12;
    }

    return String.format("%d %s", hourAmPm, suffix);
  }

  /**
   * Method prints current time
   */
  public void print() {
    if (this.modeAmPm) {
      System.out.printf("Aktuelle Zeit: %s\n", this.getAmPmString());
    }
    else {
      System.out.printf("Aktuelle Zeit: %d Uhr\n", this.hour);
    }
  }

  /**
   * Ticks one hour
   */
  public void tick() {
    this.addHour();
  }



  /**
   * Switch mode to 12h or 24h
   */
  public void switchMode() {
    this.modeAmPm = !this.modeAmPm;
  }

  /**
   * Switched clock to summertime (adds one hour)
   */
  public void switchToSummertime() {
    if (this.summer) {
      return;
    }

    this.summer = true;
    this.winter = false;

    this.addHour();
  }

  /**
   * Switches clock to wintertime (subtract one hour)
   */
  public void switchToWintertime() {
    if (this.winter) {
      return;
    }

    this.winter = true;
    this.summer = false;

    this.subtractHour();
  }
}
