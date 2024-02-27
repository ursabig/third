package Lesson9.homework;

//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).


public class Month {

    private String name;

    private int countDays;

    private int countWorkingDays;

    public Month(String name, int countDays, int countWorkingDays) {
        this.name = name;
        this.countDays = countDays;
        this.countWorkingDays = countWorkingDays;
    }

    public String getName() {
        return name;
    }

    public int getCountDays() {
        return countDays;
    }

    public int getCountWorkingDays() {
        return countWorkingDays;
    }
}