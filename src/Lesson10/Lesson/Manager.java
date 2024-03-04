// метод getSalary будет возвращать значение по формуле
// - <базовая ставка> * (<количество подчиненных> / 100 * 3).
// Если количество подчиненных 0, то результат как у обычного рабочего.

package Lesson10.Lesson;

import Lesson10.HomeWork.Worker;

public class Manager extends Worker {
    public Manager(int baseSalary, int salary, String name) {
        super(baseSalary, salary, name);
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return getBaseSalary();
        } else {
            return super.getBaseSalary() * (numberOfSubordinates / 100 * 3);
        }
    }

    private int numberOfSubordinates = 300;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
