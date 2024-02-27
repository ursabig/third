package Lesson9.homework;

//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

public class HomeWork2 {

    public static void main(String[] args) {

        Employee employee = new Employee("Murmuzarov", 28, "male", 11);
        Employee employee1 = new Employee("Gusakov", 35, "male", 10);
        Employee employee2 = new Employee("Yatsyno", 45, "male", 9);


        System.out.println(employee.getEmployeeName() + ": " + Employee.getSalary(MonthUtils.winter));
    }
}
