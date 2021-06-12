public class TaskWork03 {
    public static void main(String[] args) {
        // Задайте массив из 5 любых целых чисел.
        byte[] test = {1, 2, 3, 4, 5};

        // Поменяйте местами первый и последний элемент в массиве.
        byte temp = test[0];
        test[0] = test[4];
        test[4] = temp;

        //Вывести в консоль результат суммы первого и среднего элемента.
        System.out.println(test[0] + test[2]);
    }
}