public class Book extends TngibleAsst {
  private String isbn;
  public Book (String name, Int price, String color, String isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }

  public String getIsbn() { return this.isbn; }
}
