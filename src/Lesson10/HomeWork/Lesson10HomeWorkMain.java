package Lesson10.HomeWork;

import Lesson10.Lesson.Director;
import Lesson10.Lesson.Manager;

public class Lesson10HomeWorkMain {

    public static void main(String[] args) {


        Worker w = new Worker(200, 1000, "Petr Petrovich");
        Employee e = new Employee(200, 1000, "Ivan Ivanovich");
        Manager m = new Manager(50, 500, "Semen Semenovich");
        Director d = new Director(60, 1200, "Igor Igorevich");

        System.out.println(m.getBaseSalary() + " - base salary \n" + m.getSalary() + " - pay for m");
        System.out.println(d.getBaseSalary() + " - base salary \n" + d.getSalary() + " - pay for d");
    }

}