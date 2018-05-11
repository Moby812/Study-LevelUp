/*
13. Выведите на экран первые 11 членов последовательности Фибоначчи.
Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */

package Lesson_2;

public class Task_13 {
    public static void main(String args[]) {
        int x = 11;                             //сколько вывести чисел Фибоначчи = 11
        int fib_1= 0, fib_2= 1, fib_3;
        System.out.print(fib_1 +" "+ fib_2 +" ");
        for (int i = 3; i <= x; i++) {
            fib_3 = fib_1+fib_2;
            System.out.print(fib_3 +" ");
            fib_1 = fib_2;
            fib_2 = fib_3;
        }
    }
}
