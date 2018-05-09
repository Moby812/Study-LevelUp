package Lesson_1;/*
2. В первую задачу добавьте возможность пользователю самому вводить данные a и b.
Используйте класс Scanner.
(https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/)
*/

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        System.out.println("Для формирования линейного уровнения вида (ax + b = 0)\n Введите два любых значения: ");
        Scanner scan = new Scanner(System.in);
//   double a = scan.nextInt();
        int a = scan.nextInt();
        System.out.println ("\"a\" будет = " + a);
//   double b = scan.nextInt();
        int b = scan.nextInt();
        System.out.println ("\"b\" будет = " + b);
//   double x = -b / a;
        int x = -b / a;
        System.out.println(a + "x + " + b + " = 0");
        System.out.print("x = " + x);
    }
}
