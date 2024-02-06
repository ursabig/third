public class Lesson3 {
    public static void main(String[] args) {
/*
        int totalOranges = 10;
        int forCheburashka = 5;
        int forGena = totalOranges - forCheburashka;


        if (forCheburashka > forGena) {
            System.out.println("Чебурашка - олень");
        }

        else if (forGena > forCheburashka)
            System.out.println("Гена - олень");

        else if (forGena == forCheburashka)
                System.out.println("Оба хороши");

        System.out.println("Всё! Пуру-пу-пу");*/


        boolean itMoves = true;
        boolean shouldItMove = true;

        if (itMoves && !shouldItMove) {
            System.out.println("Use duct type");
        }

        else if (!itMoves && shouldItMove) {
            System.out.println("Use WD-40");
        }

        else {
            System.out.println("No problem");
        }



    }
}
