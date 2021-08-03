import java.util.Scanner;

public class TaskWork12 {
    public static void main(String[] args) {
// Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
        String a;

        Scanner reader = new Scanner(System.in);
        System.out.println("Введите фразу I like Java!!!: ");
        a = reader.nextLine();

        // Проверить, содержит ли строка подстроку “Java” (используйте contains())
        boolean include = a.contains("Java");

        // Проверить, начинается ли строка с подстроки “I like” (используйте startsWith())
        boolean starts = a.startsWith("I like");

        // Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith())
        boolean ends = a.endsWith("!!!");

        System.out.println("Строка содержит 'Java': "+ include);
        System.out.println("Строка начинается с 'I like': "+ starts);
        System.out.println("Строка заканчивается '!!!': "+ ends);

        // Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (include == true & starts == true & ends == true) {
                    System.out.println(a.toUpperCase());
        //Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
            String result = a.replace("a",  "o");
            System.out.println(result.substring(7, 11));
                }
                else {
            System.out.println("Ошибка!");
            }

        }
}

