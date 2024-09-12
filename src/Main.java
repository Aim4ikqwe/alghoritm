import java.util.Random;

public class Main {
    public static final int ARRAY_SIZE = 1000;
    public static void main(String[] args) {
        // Массив чисел
        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();
        // Добавление чисел из файла в массив
            for (int i = 0; i < ARRAY_SIZE; i++) {
                array[i] = random.nextInt(1, 10001);
            }
        int divided14 = 0;
        int divided7 = 0;
        int divided2 = 0;
        int max = 0;
        int result1 = 0;
        int result2 = 0;

        // Поиск максималльных чисел
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (array[i] % 14 == 0 && array[i] > divided14) // Поиск максимального числа, кратного 14
            { divided14 = array[i]; }
            else if (array[i] % 7 == 0 && array[i] > divided7) // Поиск максимального числа, кратного 7
            { divided7 = array[i]; }
            else if (array[i] % 2 == 0 && array[i] > divided2) // Поиск максимального числа, кратного 2
            { divided2 = array[i]; }
            else if (array[i] > max)
            { max = array[i]; } // Поиск максимального числа
        }


        if (divided14 != 0)
        { result1 = divided14 * Math.max(divided2, Math.max(divided7, max)); }  // result1 =  кратное 14 * макс. число, не кратное 14
        if (divided2 != 0 && divided7 != 0)
        {result2 = divided2 * divided7; } // result = 2, кратное 2 * макс. число, кратное 7

        int finallyResult = Math.max(result1, result2); // находим из них максимальное и выводим его

        if (finallyResult != 0) System.out.println(finallyResult);
        else System.out.println(-1);
    }
}