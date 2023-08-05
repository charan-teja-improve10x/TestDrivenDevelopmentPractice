package sortedArrays;

public class SortedArray {
    public boolean sortingTheArray(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return false;
        } else if (numbers.length == 1){
            return true;
        }else if (numbers.length > 1){
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
