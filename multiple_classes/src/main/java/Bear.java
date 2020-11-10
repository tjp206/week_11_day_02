import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<Salmon>();
    }

    public int foodCount() {
        return this.belly.size();
    }

    public void eat(Salmon salmon) {
        this.belly.add(salmon);
    }

    public void sleep() {
        this.belly.clear();
    }

    public void eatFishFromRiver(River river) {
        Salmon salmon = river.removeFish();
        this.eat(salmon);
    }
}
