import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    private ArrayList<HashMap> library;
    private int capacity;


    public Library(int capacity) {
        this.library = new ArrayList<HashMap>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.library.size();
    }

    public void addIfCapacityNotFull(HashMap library) {
        if(this.capacity > this.bookCount()) {
            this.library.add(library);
        }
    }
}
