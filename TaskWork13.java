import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
// Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите слова через пробел: ");
        String words = reader.nextLine();

        // Выведите слова, состоящие только из латиницы
        words = words.replaceAll("[^A-Za-z0-9 ]", "");
        System.out.println(words);

        // Выведите количество этих слов
        String[] str = words.split(" ");
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= 1)
                result++;
        }
        System.out.println("Количество слов: " + result);


    }
}
