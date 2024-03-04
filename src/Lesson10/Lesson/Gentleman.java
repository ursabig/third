package Lesson10.Lesson;

public class Gentleman extends Person {

    public Gentleman(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return "mr. " + getName();
    }

}
