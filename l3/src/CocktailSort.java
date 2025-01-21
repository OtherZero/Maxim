import java.util.Arrays;

public class CocktailSort {
    public static void cocktailSort(int[] array) {
        boolean swapped;
        int left = 0;
        int right = array.length - 1;

        do {
            swapped = false;

            // Прямой проход
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;

            // Если обменов не было, выход из цикла
            if (!swapped) break;

            swapped = false;

            // Обратный проход
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Before sorting: " + Arrays.toString(array));
        cocktailSort(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
