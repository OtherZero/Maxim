
public class CocktailSortTest {
public static void main(String[] args) {
        CocktailSortTest test = new CocktailSortTest();
        test.testSortEmptyArray();
        test.testSortSingleElement();
        test.testSortAlreadySorted();
        test.testSortReverseOrder();
        test.testSortRandomOrder();
        System.out.println("All tests passed!");
    }

    public void testSortEmptyArray() {
        int[] array = {};
        CocktailSort.cocktailSort(array);
        assert java.util.Arrays.equals(array, new int[]{});
    }

    public void testSortSingleElement() {
        int[] array = {1};
        CocktailSort.cocktailSort(array);
        assert java.util.Arrays.equals(array, new int[]{1});
    }

    public void testSortAlreadySorted() {
        int[] array = {1, 2, 3, 4, 5};
        CocktailSort.cocktailSort(array);
        assert java.util.Arrays.equals(array, new int[]{1, 2, 3, 4, 5});
    }

    public void testSortReverseOrder() {
        int[] array = {5, 4, 3, 2, 1};
        CocktailSort.cocktailSort(array);
        assert java.util.Arrays.equals(array, new int[]{1, 2, 3, 4, 5});
    }

    public void testSortRandomOrder() {
        int[] array = {3, 5, 2, 4, 1};
        CocktailSort.cocktailSort(array);
        assert java.util.Arrays.equals(array, new int[]{1, 2, 3, 4, 5});
    }
}

