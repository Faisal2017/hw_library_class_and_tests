import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

  Library library;
  Book book;

  @Before
  public void before() {
    library = new Library("Leith Library");
    book = new Book();
  }

  @Test
  public void hasName() {
    assertEquals("Leith Library", library.getName());
  }

  @Test
  public void shelvesStartEmpty() {
    assertEquals(0, library.bookCount());
  }

  @Test
  public void canStockShelfWithBook() {
    library.addBookToShelf(book);
    assertEquals(1, library.bookCount());
  }

  @Test
  public void cannotAddBooksWhenShelvesFull() {
    for (int i = 0; i < 15; i ++) {
      library.addBookToShelf(book);
    }
    assertEquals(10, library.bookCount());
  }

}