//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы
// которые были переданы в качестве аргумента.
// К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.



package Lesson9.homework;

public class HomeWork3 {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setManagerName("Petr Petrovich");
        manager.setSalaryPerDay(20.3);

        System.out.println(Manager.getSalaryPerDay());

        System.out.println(manager.getManagerName() + ": " + Manager.getSalary(MonthUtils.winter));

    }
}
