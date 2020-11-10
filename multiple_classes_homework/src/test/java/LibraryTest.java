import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private HashMap book1;
        private HashMap book2;
        private HashMap book3;


        @Before
        public void before() {
            library = new Library(2);
            book1 = new HashMap<String, String>();
            book1.put("Title", "The Haunting");
            book1.put("Author", "TJ");
            book1.put("Genre", "Horror");
            book2 = new HashMap<String, String>();
            book2.put("Title", "Harry Potter");
            book2.put("Author", "JK Rowling");
            book2.put("Genre", "Fantasy");
            book3 = new HashMap<String, String>();
            book3.put("Title", "TJ Goes Home");
            book3.put("Author", "TJ");
            book3.put("Genre", "Biography");

        }

        @Test
        public void libraryHasBooks() {
            library.addBook(book1);
            assertEquals(1, library.bookCount());
        }

        @Test
        public void addBooksIfLessThanCapacity() {
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            assertEquals(3, library.bookCount());
        }
}
