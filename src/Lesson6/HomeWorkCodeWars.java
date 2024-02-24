package Lesson6;

public class HomeWorkCodeWars {
    public static void main(String[] args) {
        System.out.println(isLove(16, 47));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0);
        }
     }

//        public class Lesson6.HomeWorkCodeWars {
//            public static void main(String[] args) {
//                System.out.println(isLove(41, 40));
//            }
//
//            public static boolean isLove(final int flower1, final int flower2) {
//                boolean a = isOdd(flower1) && isNotOdd(flower2);
//                boolean b = isNotOdd(flower1) && isOdd(flower2);
//                return  a || b;
//            }
//
//            public static boolean isOdd (int number) {
//                return number % 2 == 0;
//            }
//            public static boolean isNotOdd (int number) {
//                return number % 2 != 0;
//            }

