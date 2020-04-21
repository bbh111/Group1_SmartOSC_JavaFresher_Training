package com.smartosc.utl;

public class NumberUtil {
    public boolean checkIsNumber(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
}
