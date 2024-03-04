package TaskBySasha.extend;

public abstract class Transport {

    private final String color;
    private final String size;


    public Transport(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void moveDefault() {
        System.out.println("транспорт движется");
    }

    public abstract void move();

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
