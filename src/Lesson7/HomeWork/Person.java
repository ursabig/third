//Необходимо создать класс Person с полями:
// имя, возраст, пол. Класс должен иметь метод - getName,
// метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

package Lesson7.HomeWork;

public class Person {
    private String name;
    private int age;
    private Sex sex;


    public String getName() {
        if (sex.equals(Sex.MALE)) {
            return "Mr. " + name;
        }
        return "Mrs. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
