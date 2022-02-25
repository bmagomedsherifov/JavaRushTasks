package com.javarush.task.pro.task09.task0908;

public class tett {

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null)
            return "";
        char[] array = new char[binaryNumber.length()];

        for (int i = 0; i < binaryNumber.length(); i++) {
            array[i] = binaryNumber.charAt(i);
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            System.out.print(array[i] + " ");

        }

        return binaryNumber;
    }
    public static void main(String[] args) {
        toHex("01010101010");


    }
}
