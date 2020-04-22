package com.smartosc.utl;
import java.util.Random;

public class NumberUtil {
    public boolean checkIsNumber(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    public static int randomInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

}
