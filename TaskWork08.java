import java.util.Scanner;

public class TaskWork08 {
    public static void main(String[] args) {
        // Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n
        int n;
        int start = 0;
        int sumUneven = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        n = reader.nextInt();
        while (start <= n)
        {
            if (start % 2 != 0) {
                sumUneven += start;
            }
            start++;
            }
        System.out.print("Сумма нечетных чисел до " + n + " = " + sumUneven);
        }

    }
