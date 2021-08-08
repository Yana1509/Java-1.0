import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
// Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Выполните следующие действия:
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите слова через пробел: ");
        String words = reader.nextLine();

        String[] str = words.split(" ");
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].matches("[a-zA-Z]+")) {

                System.out.print(str[i] + " ");
                result++;
            }
        }
        System.out.println("\nКоличество слов: " + result);


    }
}
