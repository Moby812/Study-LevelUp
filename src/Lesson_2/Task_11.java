/*
11. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */

package Lesson_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String args[]){
        int x;
        int count = 0;
        System.out.println("Вводите натуральное число: ");
        Scanner sr = new Scanner(System.in);
        x = sr.nextInt();
        System.out.println("Число \"" + x + "\" делится на: " );
        for(int i = 1; i <= x; i++){
            if ((x % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей - " + count);
    }
}