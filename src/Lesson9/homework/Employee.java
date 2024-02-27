package Lesson9.homework;

import Lesson9.homework.HomeWork2;

public class Employee {

    private String employeeName;
    private int employeeAge;
    private String sex;
    private static int salaryPerDay;

    public Employee(String employeeName, int employeeAge, String sex, int salaryPerDay) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }


    public static int getSalary(Month[] monthArray) {
        Month[] MonthArray = {MonthUtils.April, MonthUtils.March, MonthUtils.March};

        int salaryPerMonth = 0;

        for (int i = 0; i < MonthArray.length; i++) {
            salaryPerMonth += MonthArray[i].getCountWorkingDays() * Employee.getSalaryPerDay();
        }
        return salaryPerMonth;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
}
