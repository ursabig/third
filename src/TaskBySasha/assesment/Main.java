// создать класс айтишник с двумя полями level и salary. Левел может быть 4 уровней (джун, миддл, сеньор и Андрей Иванович)
// создать класс ассесмент с методом doAssessment, который на вход принимает массив айтишников
// в этом методе получить левел каждого. Если это джун и его зарплата меньше 100, добавить 50, если больше или равно 100, оставить как есть
// если это миддл и его зарплата меньше 200, добавить 50, а если 200 и более, оставить как есть
// для сеньора если зарплата меньше 300, добавить 50, если 300 и более - оставить как есть
// если Андрей - добавить тысячу
// из метода вернуть массив сотрудников с зарплатами и распечатать сотрудников с зарплатами (напечатать левел, зарплата)

package TaskBySasha.assesment;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Aitishnik a1 = new Aitishnik();
        a1.setLevel(Level.JUNIOR);
        a1.setSalary(98);

        Aitishnik a2 = new Aitishnik();
        a2.setLevel(Level.MIDDLE);
        a2.setSalary(170);

        Aitishnik a3 = new Aitishnik();
        a3.setLevel(Level.SENIOR);
        a3.setSalary(280);

        Aitishnik a4 = new Aitishnik();
        a4.setLevel(Level.ANDREI_IVANOVICH);
        a4.setSalary(410);

        Aitishnik a5 = new Aitishnik();
        a5.setLevel(Level.JUNIOR);
        a5.setSalary(110);

        Aitishnik a6 = new Aitishnik();
        a6.setLevel(Level.MIDDLE);
        a6.setSalary(220);

        Aitishnik a7 = new Aitishnik();
        a7.setLevel(Level.SENIOR);
        a7.setSalary(340);

        Aitishnik[] it = {a1, a2, a3, a4, a5, a6, a7};
        Assessment ass = new Assessment();
        Aitishnik[] result = ass.doAssessment(it);

        

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getLevel() + " : " + result[i].getSalary());
        }
    }
}
