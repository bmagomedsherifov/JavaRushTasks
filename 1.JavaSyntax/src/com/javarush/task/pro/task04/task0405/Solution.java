package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int m = 0;
        while (m < 10) {
            int n = 0;
            while (n < 20) {
                if (n == 0 || n == 19) {
                    System.out.print("Б");
                }
                else if (m == 0 || m == 9) {
                    System.out.print("Б");
                }
                else {
                    System.out.print(" ");
                }
                n++;
            }
            System.out.println();
            m++;
        }






    }
}