package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try{
            if(str == null){
                return false;
            }
            if(str.startsWith("0")){
                return false;
            }
            double num = Double.parseDouble(str);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
