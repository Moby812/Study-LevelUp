/*
7. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
*/

package Lesson_2;

public class Task_7 {
    public static void main(String[] args) {

        int count=0;
        for (int i=1; count < 55; i += 2, count+=1)
            System.out.println(i);
        System.out.println("Было выведено "+ count + " значений");

    }
}
