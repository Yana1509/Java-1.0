import java.util.Scanner;

public class TaskWork09 {
    public static void main(String[] args) {

        int arraySize;

        // Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        arraySize = reader.nextInt();

        double[] myArray = new double[arraySize];
        arraySize = myArray.length; // значение с клавиатуры устанавливаем как размер массива

        System.out.println("Введите значения элементов массива через пробел: "); // присваиваем элементам значения
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = reader.nextDouble();

        }
        // Посчитайте среднее арифметическое элементов массива.
        double average = 0;
        if (myArray.length > 0) {
            double sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
            average = sum / myArray.length; {
            System.out.println("среднее арифметическое чисел: " + sum / myArray.length); }

            // произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
            for (int i = 0; i < myArray.length; i++) {

                System.out.println(myArray[i] +  " * " + sum / myArray.length + " = " + myArray[i] * sum / myArray.length);


            }
        }
    }
}




