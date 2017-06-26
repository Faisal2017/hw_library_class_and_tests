public class Library {

  private String name;
  private Book[] shelves;

  public Library(String name) {
    this.name = name;
    this.shelves = new Book[10];
  }

  public String getName() {
    return this.name;
  }

  public int bookCount() {
    int numberOfBooks = 0;

    for (Book book : this.shelves) {
      if (book != null) {
        numberOfBooks ++;
      }
    }

    return numberOfBooks;
  }

  public void addBookToShelf(Book book) {
    if (isShelvesFull()) return;
    int index = bookCount();
    this.shelves[index] = book;
  }

  public boolean isShelvesFull() {
    return bookCount() == this.shelves.length;
  }

  public void removeBookFromShelf(Book book) {
    int index = bookCount();
    this.shelves[index - 1] = null;
  }

}

