import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskWork07 {
    public static void main(String[] args) {

        final int x, y, z;
        x = 15;
        y = 20;
        z = 25;

        int arraySize;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        arraySize = reader.nextInt();

        int[] array = new int[arraySize];
        arraySize = array.length; // значение с клавиатуры устанавливаем как размер массива

        System.out.println("Введите значения элементов массива через пробел: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
            if (array[i] == x) {
                System.out.println(x + " есть в константах");
                continue;
            }
            if  (array[i] == y) {
                System.out.println(y + " есть в константах");
                continue;
            }
            if  (array[i] == z) {
                System.out.println(z + " есть в константах");
                continue;
            }

        }

    }
}






