package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int num = Integer.parseInt(str);
        if(num > 0){
            return true;
        }
        return false;
    }
}
