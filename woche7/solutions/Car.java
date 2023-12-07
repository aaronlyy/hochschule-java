public class Car {

  int topspeed;
  int speed;
  String[] directions;
  int direction;

  public Car(int topspeed) {
    if (topspeed < 50) {
      this.topspeed = 50;
    }
    else {
      this.topspeed = topspeed;
    }
    this.speed = 50;
    this.directions = new String[] {"Norden", "Osten", "Süden", "Westen"};
    this.direction = 0;
  }

  public void turnLeft() {
    if (this.direction == 0) {
      this.direction = 3;
    }
    else {
      this.direction--;
    }
  }

  public void turnRight() {
    if (this.direction == 3) {
      this.direction = 0;
    }
    else {
      this.direction++;
    }
  }

  public void speedup() {
    if (this.speed + 10 <= this.topspeed) {
      this.speed += 10;
    }
    else {
      this.speed = this.topspeed;
    }
  }

  public String toString() {
    return String.format("Auto fährt mit Geschwindigkeit %d Richtung %s\n", this.speed, this.directions[this.direction]);
  }
}
