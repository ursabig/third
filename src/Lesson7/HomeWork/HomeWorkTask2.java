//Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
// Класс должен иметь метод isSameName(Employee employee) который возвращает true,
// если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

package Lesson7.HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Edita Orlova");
        e1.setAge(26);
        e1.setSex(Sex.FEMALE);


        Employee e2 = new Employee();
        e2.setName("Evgeniya Trotskaya");
        e2.setAge(31);
        e2.setSex(Sex.FEMALE);

        Employee e3 = new Employee();
        e3.setName("Sergey Gasak");
        e3.setAge(27);
        e3.setSex(Sex.MALE);

        System.out.println(e1.isSameName(e1));

        }

    }
