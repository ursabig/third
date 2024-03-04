//Необходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
// setBaseSalary
//getName - получить имя
//setName
//getSalary - получить зарплату


package Lesson10.HomeWork;

public class Employee {


    private int baseSalary = 30;
    private int salary;
    private String name;


    public Employee(int baseSalary, int salary, String name) {
        this.baseSalary = baseSalary;
        this.salary = salary;
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Сотрудник года: " +
                "baseSalary=" + baseSalary +
                ", salary=" + salary +
                ", name=" + name;
    }
}
