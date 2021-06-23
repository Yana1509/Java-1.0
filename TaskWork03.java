public class TaskWork03 {
    public static void main(String[] args) {

        // Задайте массив из 5 любых целых чисел.
        int[] test = {1, 2, 3, 4, 5};

        // Поменяйте местами первый и последний элемент в массиве.
        int temp = test[0];
        test[0] = test[test.length-1];
        test[test.length-1] = temp;

        //Вывести в консоль результат суммы первого и среднего элемента.
        int result = test[0] + test[(test.length-1)/2];
        System.out.println(result);
    }
}