package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int min_1 = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int a = scanner.nextInt();
            if(a < min_1) {
                min_2 = min_1;
                min_1 = a;
            }
            else if (a < min_2 && a != min_1)
                    min_2 = a;
        }
        System.out.print(min_2);

    }
}