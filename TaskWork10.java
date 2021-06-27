import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {

        int m; // количество строк в матрице
        int n; //количество столбцов в матрице

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите количество столбцов матрицы: ");
        m = reader.nextInt();
        System.out.print("Введите количество строк матрицы: ");
        n = reader.nextInt();
        int[][] matrix = new int[m][n];

        System.out.println("Заполните " + m * n + " цифр в матрице: ");

        int i, j;
        for (j = 0; j < m; j++) {
            for (i = 0; i < n; i++) {
                matrix[j][i] = reader.nextInt();
                if (i == 0)
                break;
            }
            System.out.println(matrix[j][i] + " * 3 = " + matrix[j][i] * 3 + ";");
            }
        }

}
