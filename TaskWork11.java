import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        String str;

// Ввести первое  число с клавиатуры и записать его в строковую переменную:
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int m = reader.nextInt();
        str = Integer.toString(m);

// Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int
        System.out.print("Введите второе число: ");
        int n = reader.nextInt();

        Integer x = Integer.parseInt(str);

// Сравнить 2 числа и вывести большее на экран
        int max = Math.max(n, x);
        System.out.println("Большеe число из них: " + max);

// Выведите также меньшее число на экран, предварительно переконвертировать его в тип double
        double min = Math.min(n, x);
        System.out.println("Меньшее число из них: " + min);

    }
}
