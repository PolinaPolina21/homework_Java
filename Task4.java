import java.util.Scanner;
    public class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double x, y, z;
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            z = scanner.nextDouble();

            double mean = (x + y + z) / 3;
            System.out.println(mean);

            double var1 = Math.floor(mean / 2);

            if (var1 > 3) {
                System.out.println("Программа выполнена корректно");
            }
        }
    }

/* Задача №4_Операторы
Написать программу, которая будет выполнять следующие действия:

Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

 */
