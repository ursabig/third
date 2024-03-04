package TaskBySasha.extend;

public class Bus extends Transport{

    public Bus(String color, String size) {
        super(color, size);
    }

    @Override
    public void move() {
        System.out.println("Едет автобус");
    }
}
