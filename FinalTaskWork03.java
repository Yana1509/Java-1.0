import java.util.Scanner;

public class FinalTaskWork03 {
    public static void main(String[] args) {
        // Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
        Scanner reader = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int numberOfStrings = reader.nextInt();
        String array[] = new String[numberOfStrings];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Строка " + (i + 1) + ":");
            array[i] = reader.next();
        }
        int maxLength = 0;
        int maxStrIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int currentLength = (int) array[i].chars().distinct().count();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStrIndex = i;
            }
        }
        System.out.println("Ответ: " + array[maxStrIndex]);
    }
}
