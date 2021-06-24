import java.util.Scanner;

public class TaskWork06 {
    public static void main(String[] args) {
        int selectObjectConvert;
        int itemPositionParam;
        double value;
        double[] paramMas = new double[3];
        Scanner reader = new Scanner(System.in);
        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        selectObjectConvert = reader.nextInt();
        if (selectObjectConvert == 1) {
            System.out.print("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - тонна: "); }
         else {
            if (selectObjectConvert == 2) {
                System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд: ");
            }
            else {
                System.out.print("Error");
            }
        }
        itemPositionParam = reader.nextInt();

        System.out.print("Введите число: ");

        value = reader.nextInt();

        switch (selectObjectConvert) {
            case 1: {
                switch (itemPositionParam) {
                    case 1: {
                        itemPositionParam = 1; // пришли граммы
                        paramMas[0] = value; // граммы остаются граммами
                        paramMas[1] = value / 1000; // граммы перевели в килограммы
                        paramMas[2] = value / 1000000; // граммы перевели в тонны
                    }
                    break;
                    case 2: {
                        paramMas[0] = value * 1000; // килограммы перевели в граммы
                        paramMas[1] = value; // килограммы остаются килограммами
                        paramMas[2] = value / 1000; // килограммы перевели в тонны
                    }
                    break;
                    case 3: {
                        paramMas[0] = value * 1000000; // тонны перевели в граммы
                        paramMas[1] = value / 1000; // тонны перевели в килограммы
                        paramMas[2] = value; // тонны остаются тоннами
                    }
                    break;

                }
            }
            break;
            case 2: {
                switch (itemPositionParam) {
                    case 1: {
                        paramMas[0] = value; // метры остаются метрами
                        paramMas[1] = value * 0.00062; // метры перевели в мили
                        paramMas[2] = value * 1.09; // метры перевели  в ярды
                    }
                    break;
                    case 2: {
                        paramMas[0] = value * 1000; // мили перевели в метры
                        paramMas[1] = value; // мили остаются милями
                        paramMas[2] = value * 1760; // мили перевели в ярды
                    }
                    break;
                    case 3: {
                        paramMas[0] = value * 0.91; // ярды перевели в метры
                        paramMas[1] = value * 0.00057; // ярды перевели в мили
                        paramMas[2] = value; // ярды остаются ярдами
                    }
                    break;
                }

            }
            break;
            default: {
                System.out.println("\nОшибка\n");
            }

        }
        for (int i = 0; i < paramMas.length; i++) {
            System.out.println(paramMas[i]);
        }
    }
}


