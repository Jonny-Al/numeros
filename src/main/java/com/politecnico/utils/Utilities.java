package com.politecnico.utils;

public class Utilities {
    public static boolean validNumeroPrimo(int number) {
        for (int i = 2; i < number / 2; i++) {
            return (number % i == 0) ? false : true;
        }
        return true;
    }

}
