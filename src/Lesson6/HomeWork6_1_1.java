package Lesson6;//Дана строка:
//String s = “Перестановочный алгоритм быстрого действия”;
//необходимо вывести все буквы “о” из этой строки.
//Для указанной строки ответ будет “ооооо” (или в столбик)


public class HomeWork6_1_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
    }
}
