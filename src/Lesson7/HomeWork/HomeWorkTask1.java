//Необходимо создать класс Person с полями:
// имя, возраст, пол. Класс должен иметь метод - getName,
// метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.


package Lesson7.HomeWork;

public class HomeWork7 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Edita Orlova");
        p1.setAge(26);
        p1.setSex(Sex.FEMALE);


        Person p2 = new Person();
        p2.setName("Evgeniya Trotskaya");
        p2.setAge(31);
        p2.setSex(Sex.FEMALE);

        Person p3 = new Person();
        p3.setName("Sergey Gasak");
        p3.setAge(27);
        p3.setSex(Sex.MALE);

        Person[] people = {p1, p2, p3};

        for (Person var : people) {
            System.out.println(var.getName());
        }
    }
}
