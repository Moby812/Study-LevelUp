package Lesson_1;/*
3. Напишите программу вычисляющую квадратное уравнение ax*x + b * x + c = 0.
Коэффициенты вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args){
        System.out.println("Для формирования квадратного уровнения вида (ax*x + b * x + c = 0)\n Введите три любых значения: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
     //   System.out.println ("\"a\" будет = " + a);
        double b = scan.nextInt();
    //    System.out.println ("\"b\" будет = " + b);
        double c = scan.nextInt();
    //    System.out.println ("\"с\" будет = " + c);
        double d = b*b-4*a*c;               //вычисляем дискриминант
        System.out.println("дискриминант = "+d);
        if (d > 0) {
            double kor = Math.sqrt(d);          //корень дискриминанта
            double x1 = (-b - kor) / (2 * a);
            double x2 = (-b + kor) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (d < 0){
            System.out.println("Так как дискриминант меньше нуля, то уравнение не имеет действительных решений.");
        }else if (d == 0){
            double x = -b/(2*a);
            System.out.println("x = " + x);
        }
    }
}
