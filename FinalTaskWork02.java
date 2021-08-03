import java.util.Scanner;

public class FinalTaskWork02 {
    public static void main(String[] args) {
        // Напишите программу, которая позволит решить простое уравнение относительно x
        Scanner reader = new Scanner(System.in);

        System.out.println("Введите простое уравнение, состоящее из пяти символов: ");
    String str = reader.nextLine();
    int result = 0;
    int x = str.indexOf('x');
    char[] math = str.toCharArray();
        if (math.length == 5) {
        if (math[1] == '+') {
            switch (x) {
                case (0):
                    result = Character.getNumericValue(math[4]) - Character.getNumericValue(math[2]); //если вместо цифры будет символ, то вернет -1
                    break;
                case (2):
                    result = Character.getNumericValue(math[4]) - Character.getNumericValue(math[0]);
                    break;
                case (4):
                    result = Character.getNumericValue(math[0]) + Character.getNumericValue(math[2]);
                    break;
            }
            System.out.println("x = " + result);
        }
        else if (math[1] == '-') {
            switch (x) {
                case (0):
                    result = Character.getNumericValue(math[4]) + Character.getNumericValue(math[2]);
                    break;
                case (2):
                    result = Character.getNumericValue(math[0]) - Character.getNumericValue(math[4]);
                    break;
                case (4):
                    result = Character.getNumericValue(math[0]) - Character.getNumericValue(math[2]);
                    break;
            }
            System.out.println("x = " + result);
        }
        else {
            System.out.println("Вы не ввели арифметический знак!");
        }
    }
        else {
        System.out.println("Ошибка!");
    }
    }
}
