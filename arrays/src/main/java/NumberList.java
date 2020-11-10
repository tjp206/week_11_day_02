import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers) {
        this.numbers = numbers ;                                 // new ArrayList<Integer>(numbers); (also works)
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumber(int i) {
        this.numbers.add(i);
    }

    public int getNumberAtIndex(int i) {
        return this.numbers.get(i);
    }

//    public int getTotal() {
//        int total = 0;
//        for(int i = 0; i < this.getNumberCount(); i++) {              // for (initialise, boolean, update)
//            total += getNumberAtIndex(i);
//        }
//        return total;
//    }

    public int getTotal() {
        int total = 0;
        for(int number : this.numbers) {                                // for (type name : list name)
            total += number;
        }
        return total;
    }
}
