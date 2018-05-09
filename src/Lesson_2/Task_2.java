/*
2. Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
Описание метода abs = http://proglang.su/java/numbers-abs
 */

package Lesson_2;

public class Task_2 {
    public static void main(String[] args) {
    int a =10;
    double m=8.5, n=11.45;
    double b= Math.abs(a-m);                //наименьшее полученное число будет указывать, что оно ближе всего к требуемому значению "а"
    double c= Math.abs(a-n);
//    double min= Math.min(b,c);              //узнаем какое из чисел будет наименьшим из двух результатов

    if (b<c){
        System.out.println(m +" ближайшее значение к числу "+ a);
    }else{
        System.out.println(n +" ближайшее значение к числу "+ a);
    }
    }
}