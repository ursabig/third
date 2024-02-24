//Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray)
// метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.

   package Lesson7.HomeWork;

public class HomeWorkTask3 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setSalary(3);

        Employee e2 = new Employee();
        e2.setSalary(2);

        Employee e3 = new Employee();
        e3.setSalary(5);

        Employee[] emp = {e1, e2, e3};

        Salary salary = new Salary();
        int money = salary.getSum(emp);

        System.out.println(money);

    }
}
