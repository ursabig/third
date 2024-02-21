package Lesson7.HomeWork;

public class Employee {
    private String name;
    private int age;
    private Sex sex;

    private int salary;

    String employee;
    public boolean isSameName() {
        if (employee.equals(name))
    return true};
    public String getName() {
        return name;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployee() {
        return employee;
    }
}
