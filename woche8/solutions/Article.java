public class Article {

  private int no;
  private double price;
  private String title;

  private static int count = 0;

  public Article(double price, String title) {
    count++;
    this.no = count;
    this.price = price;
    this.title = title;
  }

  public String toString() {
    return String.format("Artikelnummer: %d, Bezeichnung: %s, Preis: %f\nAnzahl Artikel im Lager: %d", this.no, this.title, this.price, count);
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public static void changePrices(Article[] articles, double percentage) {
    for (Article article : articles) {
      article.setPrice(article.getPrice() - (article.getPrice() * (percentage / 100)));
    }
  }
}
