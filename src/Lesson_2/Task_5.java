/*
5. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
Создать программу, которая переставит числа в переменных таким образом,
чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
Числа в переменных a, b и c: 3, 9, -1
Возрастающая последовательность: -1, 3, 9
Массивы с котиками - http://developer.alexanderklimov.ru/android/java/array.php
*/

package Lesson_2;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int a=3, b=9,c=-1;
//        int[] number = new int[3];                    //создали массив
//            number[0]= a;                             //назначили значение в первую ячейку массива
//            number[1]= b;
//            number[2]= c;
        int[] number = {a,b,c};                         //создали массив и сразу назначили
        Arrays.sort(number);                            //сортировка
        System.out.println(Arrays.toString(number));
    }
}
