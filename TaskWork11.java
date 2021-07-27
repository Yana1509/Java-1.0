import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        Double m; // первое число
        Double n; //второе число

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        m = reader.nextDouble();
        String str1 = String.valueOf(m);

        System.out.print("Введите второе число: ");
        n = reader.nextDouble();
        int a = n.intValue();

            if (m < n) {

                System.out.println("Большее число: " + n);
            } else if (m > n) {
                System.out.println("Большее число: " + m);
            }
            else {
                System.out.println("Числа равны");
            }
            // 4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
            // оба числа представляют разный тип данных, пробовала ввести переменную min и переконвертировать ее, не получается

    }
}
