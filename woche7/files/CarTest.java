public class CarTest {
  public static void main(String[] args) {
    Car myCar = new Car(85); // Auto mit Höchstgeschwindigkeit 85
    System.out.println(myCar); // cool, benutzt .toString() automatisch für die Ausabe!
    // ergibt in der Konsole: "Auto fährt mit Geschwindigkeit 50 Richtung Norden"
    myCar.speedup(); // Gas geben; Geschwindigkeit jetzt 60
    myCar.turnRight(); // Richtung jetzt: Osten
    myCar.turnRight(); // Richtung jetzt: Süden
    for (int i = 1; i <= 3; i++) {
      myCar.speedup();
      myCar.turnLeft();
    }
    System.out.println(myCar);  // cool, benutzt .toString() automatisch für die Ausabe!
    // ergibt in der Konsole: "Auto fährt mit Geschwindigkeit 85 Richtung Westen"
  }
}