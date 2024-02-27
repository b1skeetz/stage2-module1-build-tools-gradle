package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        int counter = 0;
        for (String arg : args) {
            try{
                double buffer = 0;
                if(arg.contains(".")){
                    String newStr = arg.replace(".", ",");
                } else {
                    buffer = Integer.parseInt(arg);
                }
                if(buffer > 0){
                    counter++;
                }
            } catch (NumberFormatException e){
                return false;
            }
        }
        return counter == args.size();
    }
}