// Отсутствующий модификатор доступа означает, что класс будет доступен в пределах package
//

package Lesson9;

public class Lesson {

    public static void main(String[] args) {
        UserLesson user = new UserLesson("Petrov");

        System.out.println(user.getFullname());

    }
}
