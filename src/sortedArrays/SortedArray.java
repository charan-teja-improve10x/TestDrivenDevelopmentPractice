package sortedArrays;

public class SortedArray {
    public boolean sortingTheArray(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return false;
        } else if (numbers.length == 1){
            return true;
        }
        int n = numbers.length;
         if (n > 1){
            if (isAscendingOrder(numbers, n)) return false;
        }
        return true;
    }

    private static boolean isAscendingOrder(int[] numbers, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
