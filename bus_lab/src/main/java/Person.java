import java.util.ArrayList;

public class Person {

    private ArrayList<Person> passengers;

    public Person() {
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }

}
