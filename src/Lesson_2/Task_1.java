/*
1. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
 */

package Lesson_2;

public class Task_1 {
    public static void main(String[] args) {

        int n =6;
        int x = n%2;
                if (x==0){
                    System.out.println("\"n\" является чётным");
                }else{
                    System.out.println("\"n\" является нечётным");
                }
    }
}
