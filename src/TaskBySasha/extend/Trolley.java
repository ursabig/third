package TaskBySasha.extend;

public class Trolley extends Transport {

    private String roga;

    public String getRoga() {
        return roga;
    }

    public Trolley(String color, String size, String roga) {
        super(color, size);
        this.roga = roga;
    }

    @Override
    public void move() {
        System.out.println("Едет троллейбус");
    }
}
