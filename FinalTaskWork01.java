import java.util.Scanner;

public class FinalTaskWork01 {
    public static void main(String[] args) {
        // Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу
        Scanner reader = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double curs = reader.nextDouble();
        System.out.println("Количество рублей: ");
        double rub = reader.nextDouble();
        double result = rub / curs;
        System.out.printf("Итого: %.2f долларов", result);
    }
}
