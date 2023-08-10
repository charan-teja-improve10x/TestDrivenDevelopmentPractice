package mediumarrays;

public class CountSubArrays {
    public int findTheSubArraysWithGivenSum(int[] numbers, int k) {
        if (numbers == null || numbers.length == 0){
            return -1;
        } else if (numbers[0] == k) {
            return 1;
        }
        return 0;
    }
}
