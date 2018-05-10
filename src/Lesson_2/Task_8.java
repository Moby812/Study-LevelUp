/*
8. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
*/

package Lesson_2;

public class Task_8 {
    public static void main(String[] args) {
        int count=0;
        for (int i=90; i >= 0; i -= 5, count+=1)
            System.out.println(i);
        System.out.println("Было выведено "+ count + " значений");
    }
}
