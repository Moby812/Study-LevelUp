/*
10. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 */

package Lesson_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите любое число до 20, мы вычислим его факториал:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a < 21){
            long count = 1;
            for (int i = 1; i <= a; i += 1) {
                count *= i;
            }
            System.out.println("Факториалом числа " + a + " будет " + count);
        }else{
            System.out.println("Значение \""+ a +"\" слишком большое для вычисления, введите значение меньше \"21\"");
        }
    }
}
