package Lesson7.Lesson7_One;

public class Main {
    public static void main(String[] args) {

        Apartment apt1 = new Apartment();
        apt1.bedrooms = 2;
        apt1.address = new Address();
        apt1.address.city = "San Francisco";
        apt1.address.state = "CA";
        apt1.price = 3500;

        Apartment apt3 = new Apartment();
        apt3.bedrooms = 1;
        apt3.address = new Address();
        apt3.address.city = "San Francisco";
        apt3.address.state = "GA";
        apt3.price = 2499;



        Apartment apt2 = new Apartment();
        apt2.bedrooms = 5;
        apt2.address = new Address();
        apt2.address.city = "Atlanta";
        apt2.address.state = "OH";
        apt2.price = 1500;


        Apartment apts[] = {apt1, apt2, apt3};

//        for (int i = 0; i < apts.length; i++) {
//            Apartment currApart = apts[i];
//            if (currApart.city.equals("San Francisco"))
//            {
//                System.out.println("bedrooms: " + currApart.bedrooms);
//                System.out.println("price: " + currApart.price);
//                System.out.println("_____________");
//            }
//        }

        for (int i = 0; i < apts.length; i++) {
            Apartment currApart = apts[i];
            if (currApart.price <=2500) {
                System.out.println(apts[i].getInfoCard());
            }

        }
    }
}
