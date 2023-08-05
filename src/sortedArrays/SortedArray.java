package sortedArrays;

public class SortedArray {
    public boolean sortingTheArray(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return false;
        }
        if (numbers.length == 1){
            return true;
        }
        return false;
    }
}
