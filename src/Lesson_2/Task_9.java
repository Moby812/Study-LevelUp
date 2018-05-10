/*
9. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
*/

package Lesson_2;

public class Task_9 {
    public static void main(String[] args) {

        int count=0;
        for (int i=2; count < 20; i *= 2, count+=1)
            System.out.println(i);
        System.out.println("Было выведено "+ count + " значений");
    }
}