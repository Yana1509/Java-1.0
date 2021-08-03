import java.util.Scanner;

public class FinalTaskWork04 {
    public static void main(String[] args) {

        // Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        int attempts = 0;
        Scanner in = new Scanner(System.in);
        while (attempts < 3) {
            String a = in.nextLine();
            if (a.compareToIgnoreCase("Заархивированный вирус") == 0) {
                System.out.println("Правильно!");
                break;
            } else if (a.compareToIgnoreCase("Подсказка") == 0) {
                if (attempts == 0) {
                    System.out.println("Ответ из двух слов, речь о вирусе");
                    attempts = attempts + 2;
                    continue;
                } else {
                    System.out.println("Подсказка уже недоступна");
                    continue;
                }
            } else if (attempts == 2) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            } else {
                System.out.println("Подумай еще!");
                attempts++;
            }
        }
    }
}