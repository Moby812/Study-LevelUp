/*
6. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
*/

package Lesson_2;

public class Task_6 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1000; i < 9999; i += 3, count+=1)
            System.out.println(i);
        System.out.println("Было выведено "+ count + " значений");
    }
}
