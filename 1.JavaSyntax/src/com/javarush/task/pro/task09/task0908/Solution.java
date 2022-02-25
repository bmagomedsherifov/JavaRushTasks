package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null)
        return "";

        char[] array = new char[binaryNumber.length()];
        for (int i = 0; i < binaryNumber.length(); i++) {
            array[i] = binaryNumber.charAt(i);
        }
        if(array.length % 4 != 0) {

        }




        return binaryNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }
}
