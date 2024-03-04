package Lesson10.Lesson;

public class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private char sex;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
