public class ArticleTest {
  public static void main(String[] args) {

    // artikel anlegen
    Article teddy = new Article(5, "Teddy");
    Article ball = new Article(10, "Ball");
    Article hundekorb = new Article(100, "Hundekorb");
    Article knochen = new Article(15, "Knochen");

    // toString von Article
    System.out.println(hundekorb);

    // preise anpassen
    Article.changePrices(new Article[]{teddy, hundekorb, ball, knochen}, 20);
    System.out.println(hundekorb);
  }
}
