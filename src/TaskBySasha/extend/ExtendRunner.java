package TaskBySasha.extend;

public class ExtendRunner {
    public static void main(String[] args) {

        System.out.println(UtilMethods.sum(1, 2));

        Trolley trolley = new Trolley("GREEN", "123", "2");
//        trolley.move();
        trolley.getColor();

        Bus bus = new Bus("RED", "221");
//        bus.move();

        Transport[] transports = new Transport[]{trolley, bus};


        for (Transport transport : transports) {
            transport.move();
        }
    }
}
