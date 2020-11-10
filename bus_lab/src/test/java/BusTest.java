import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class BusTest {

        private Bus bus;
        private Person person;

        @Before
        public void before() {
            bus = new Bus(10);
            person = new Person();

        }

        @Test
        public void busHasPassengers() {
            bus.addPassenger(person);
            assertEquals(1, bus.passengerCount());
        }

        @Test
        public void canAddPassengersIfLessThanCapacity() {
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            assertEquals(11, bus.passengerCount());
        }

        @Test
        public void canRemovePassenger() {
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.removePassenger();
            assertEquals(2, bus.passengerCount());
        }
}
