/*
3. Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран. Примеры работы программы:
Число 113 не содержится в интервале (25,100). Число 72 содержится в интервале (25,100). Число 25 не содержится в интервале (25,100) Число 155 не содержится в интервале (25,100)
Генерация случайного числа в диапазоне  - http://info.javarush.ru/L2CCCP/2015/06/07/Генерация-случайного-числа-в-заданном-диапазоне.html
                                        - https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
 */

package Lesson_2;

public class Task_3 {
    public static void main(String[] args) {
        int min= 25, max=100;
        int random= (int)(5 + Math.random()*150);

        if (random > min && random < max ){
            System.out.println("Число \"" + random +"\" пападает в диапазон от " + min + " до " + max);
        }else{
            System.out.println("Число \"" + random +"\" не попало в диапазон от " + min + " до " + max);
        }
    }
}
