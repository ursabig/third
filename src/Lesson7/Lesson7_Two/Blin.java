package Lesson7.Lesson7_Two;

public class Blin {
    int min;
    int max;

    String whoAreYou;

    void printWhoAreYou (int weight) {
        if (weight >= min && weight <= max) {
            System.out.println(whoAreYou);
        }
    }

}
