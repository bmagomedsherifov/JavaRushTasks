package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean isEnter = false;
        int k =0;
        while (!isEnter) {
            int a = scanner.nextInt();
            isEnter = scanner.hasNext("ENTER");
            k = k + a;

        }
        System.out.println(k);

    }
}