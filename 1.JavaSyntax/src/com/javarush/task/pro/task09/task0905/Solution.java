package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0)
            return 0;
        else {

            //напишите тут ваш код
            int i = 0;
            int octNumber = 0;
            while (decimalNumber != 0) {
                octNumber = (int) (octNumber + (decimalNumber % 8) * Math.pow(10, i));
                decimalNumber = decimalNumber / 8;
                i++;
            }
            return octNumber;
        }
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0)
            return 0;
        else {

            //напишите тут ваш код
            int i = 0;
            int decNumber = 0;
            while (octalNumber != 0) {
                decNumber = (int) (decNumber + (octalNumber % 10) * Math.pow(8, i));
                octalNumber = octalNumber / 10;
                i++;
            }
            return decNumber;
        }
    }
}
