package Lesson7.Two;

public class Kachalka {
    public static void main(String[] args) {
        Blin b1 = new Blin();
        b1.min = 0;
        b1.max = 10;
        b1.whoAreYou = "ю ар амеба";

        Blin b2 = new Blin();
        b2.min = 11;
        b2.max = 30;
        b2.whoAreYou = "ю ар качок";

        Blin b3 = new Blin();
        b3.min = 31;
        b3.max = 50;
        b3.whoAreYou = "ю ар машина";

        Blin[] machine = {b1, b2, b3};
        
        int myWeight = 7;

//        for (int i = 0; i < machine.length; i++) {
//            Blin blin = machine[i];
//            if (myWeight > blin.min && myWeight < blin.max) {
//                System.out.println(blin.whoAreYou);
//            }
//        }

        for (int i = 0; i < machine.length; i++) {
            Blin blin = machine[i];
            machine[i].printWhoAreYou(12);

        }
    }
}
