public class TaskWork14 {
    public static void main(String[] args) {

        // Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20:
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
            System.out.println(array[i]);
        }
        // Выведите максимальный и минимальный элемент массива
        int max = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            } else if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.println("Максимальный элемент массива: " + array[max]);
        System.out.println("Минимальный элемент массива: " + array[min]);
        // Из максимального и минимального значения выведите наибольшее по модулю

        int moduleMax = Math.abs(array[max]);
        int moduleMin = Math.abs(array[min]);
        int maxMax = Math.max(moduleMax, moduleMin);
        System.out.println("Наибольший по модулю: " + maxMax);
    }
}
