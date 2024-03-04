package TrainingCodeWars;

public class ReturningStrings {

    public static void main(String[] args) {

        System.out.println(greet("Pavel"));

    }


    public static String greet (String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }


}

