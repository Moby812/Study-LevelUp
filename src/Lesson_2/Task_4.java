/*
4. Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. Примеры работы программы:
В числе 208 наибольшая цифра 8. В числе 774 наибольшая цифра 7. В числе 613 наибольшая цифра 6
*/

package Lesson_2;

public class Task_4 {
    public static void main(String[] args) {
//        int random= (int)(Math.random()*999);                 //выведет любое число от 0 до 999
        int min= 100, max=999;
        int random= (int)(min + Math.random()*(max - min));       //выведет любое число от 100 до 999
        System.out.println("Случайно сгенерированное число: " + random);

        int random_1 = random;
        int i = 0,digit;
//        while (random > 0){                                   // while (условия выхода){выполняется пока верно условие}
//            digit = random%10;
//            if (digit > number)number=digit;
//            random = random/10;
//        }
        for (; random > 0;){                                    //for(только в начале; условия выхода; выполняется после каждой итерации)
            digit = random%10;                                  //          {выполняется пока верно условие}
            if (digit > i)i=digit;
            random = random/10;
        }
        System.out.println("Наибольша цифра у числа \"" + random_1 + "\", будет " + i);
    }
}
