public class Book {
  
  private String title;
  private String pages;
  private String publication;

  public Book(String title, String pages, String publication) {
    this.title = title;
    this.pages = pages;
    this.publication = publication;
  }

  public String getTitle() {
    return title;
  }

  public String getPages() {
    return pages;
  }

  public String getPublication() {
    return publication;
  }

  @Override
  public String toString() {
    return this.title + ", " + this.pages + " pages" + ", " + this.publication;
  }
}
