public class Task3 {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        int last = array[array.length-1];

        array[array.length-1] = array[0];
        array[0] = last;
        System.out.println(array[0] + array[(array.length)/2]);
    }
}


/* Задача №3_ Массивы
        Выполните следующие действия с массивом:

        Задайте массив из 5 любых целых чисел.
        Поменяйте местами первый и последний элемент в массиве.
        Вывести в консоль результат суммы первого и среднего элемента.
        Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length

 */