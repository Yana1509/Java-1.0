import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskWork07 {
    public static void main(String[] args) {

        final int X = 15;
        final int Y = 20;
        final int Z = 25;

        int arraySize;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        arraySize = reader.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Введите значения элементов массива через пробел: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
            if (array[i] == X)
                System.out.println(X + " есть в константах");

            if  (array[i] == Y)
                System.out.println(Y + " есть в константах");

            if  (array[i] == Z)
                System.out.println(Z + " есть в константах");

        }

    }
}






