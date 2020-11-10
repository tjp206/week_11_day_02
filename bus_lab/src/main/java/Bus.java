import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> bus;

    public Bus(int capacity) {
        this.capacity = capacity;
        this.bus = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.bus.size();
    }

    public void addPassenger(Person person) {
        this.bus.add(person);
    }

    public Person removePassenger() {
        return this.bus.remove(0);
    }

    public String fullBus(){
        return "We are full";
    }

    public void addPassengerIfLessThanCapacity(Person person) {
        if(this.capacity < this.passengerCount()) {
            this.addPassenger(person);
        }
        this.passengerCount();
    }

}

