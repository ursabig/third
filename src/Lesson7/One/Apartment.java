package Lesson7;

public class Apartment {

    int bedrooms;
    Address address;
    int price;

    String getInfoCard()
    {String result = "________" + "\n price: " + price +
            "\n bedroom: " + bedrooms +
            "\n city: " + address.city +
            "\n state: " + address.state + "\n________";
return result;
    };

}
