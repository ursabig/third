public class HomeWorkCodeWarsThird {
    public static void main(String[] args) {

        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        //Add your code here
        int i = 0;
        String s = (i + " sheep...");
        for (i = 0; i <= num; i++) {
            s = (i + " sheep...");
        }
        return s;
    }
}
