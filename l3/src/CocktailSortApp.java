import java.util.Scanner;
import java.util.Arrays;

public class CocktailSortApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array before sorting: " + Arrays.toString(array));

        CocktailSort.cocktailSort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
