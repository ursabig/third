package Lesson10.Lesson;

public class Director extends Manager {

    public Director(int baseSalary, int salary, String name) {
        super(baseSalary, salary, name);
    }


    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return super.getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }
}
