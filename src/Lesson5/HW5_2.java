// печатаем пирамидки в одну и другую сторону

public class HW5_2 {
    public static void main(String[] args) {

// by A.Nurnazarov
//        for (int i = 0; i < 10; i++) {
//           int iterationJ = 10;
//            iterationJ = iterationJ - i;
//            for (int j = 0; j < iterationJ; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        another way from review
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10 - i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
