import java.util.Scanner;

public class TaskWork04 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        double result;
        double result2;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        x = reader.nextDouble();
        y = reader.nextDouble();
        z = reader.nextDouble();
        result = ((x + y + z) / 2);
        System.out.println("\nСреднее арифметическое: " + result);
        result2 = result / 2;
        System.out.println("Среднее арифметическое, поделенное на два с округлением в меньшую сторону: " + Math.floor(result2));
        if (result2 > 3) {
            System.out.println("\nПрограмма выполнена корректно");
        }

    }
}