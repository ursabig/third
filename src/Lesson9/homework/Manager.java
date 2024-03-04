package Lesson9.homework;

public class Manager {

    private String managerName;
    private int managerAge;
    private char managerSex;
    private int managerEmployeeCount;

    private static double salaryPerDay;

    public static double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public static int getSalary(Month[] monthArray) {
        Month[] MonthArray = {MonthUtils.April, MonthUtils.March, MonthUtils.March};

        int salaryPerMonth = 0;

        for (int i = 0; i < MonthArray.length; i++) {
            salaryPerMonth += MonthArray[i].getCountWorkingDays() * Manager.getSalaryPerDay();
        }
        return salaryPerMonth;
    }




    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(int managerAge) {
        this.managerAge = managerAge;
    }

    public char getManagerSex() {
        return managerSex;
    }

    public void setManagerSex(char managerSex) {
        this.managerSex = managerSex;
    }

    public int getManagerEmployeeCount() {
        return managerEmployeeCount;
    }

    public void setManagerEmployeeCount(int managerEmployeeCount) {
        this.managerEmployeeCount = managerEmployeeCount;
    }
}
