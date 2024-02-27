package Lesson9.homework;

public class MonthUtils {

    public static Month January = new Month("january", 31, 21);
    public static Month February = new Month("february", 29, 21);
    public static Month March = new Month("march", 31, 20);
    public static Month April = new Month("april", 30, 22);
    public static Month May = new Month("may", 31, 20);
    public static Month June = new Month("june", 30, 20);
    public static Month July = new Month("july", 31, 22);
    public static Month August = new Month("august", 31, 22);
    public static Month September = new Month("september", 30, 21);
    public static Month October = new Month("october", 31, 21);
    public static Month November = new Month("november", 30, 20);
    public static Month December = new Month("december", 31, 21);

    public static Month[] summer = {June, July, August};
    public static Month[] autumn = {September, July, August};
    public static Month[] winter = {December, January, February};
    public static Month[] spring = {March, April, May};

    public static Month getJanuary() {
        return January;
    }

    public static Month getFebruary() {
        return February;
    }

    public static Month getMarch() {
        return March;
    }

    public static Month getApril() {
        return April;
    }

    public static Month getMay() {
        return May;
    }

    public static Month getJune() {
        return June;
    }

    public static Month getJuly() {
        return July;
    }

    public static Month getAugust() {
        return August;
    }

    public static Month getSeptember() {
        return September;
    }

    public static Month getOctober() {
        return October;
    }

    public static Month getNovember() {
        return November;
    }

    public static Month getDecember() {
        return December;
    }
}

