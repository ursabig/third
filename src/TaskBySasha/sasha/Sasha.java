package TaskBySasha.sasha;

import java.util.Random;

public class Sasha {

    private Random rn = new Random();
    private boolean[] array = new boolean[]{true, false};

    public String say(String req) {
        String cause = "";

        if (hear()) {
            if(think()) {
                if(isWant())
                    return "Я отвечу тебе на вопрос " + req;
            } else {
                cause = "думать";
                return kick(cause);
            }
//            return "Я услышал тебя";
        } else {
            cause = "услышать";
            return kick(cause);
        }

        return "что-то пошло не так";

    }

    private boolean hear() {
        return getVariant();
    }

    private boolean think() {
        return getVariant();
    }

    private boolean isWant() {
        return true;
    }

    private boolean getVariant() {
        return array[rn.nextInt(2)];
    }

    public String kick(String cause) {
        return "понял после пинка на шаге " + cause;
    }
}
