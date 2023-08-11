package mediumarrays.maximumsubarraysum;

public class MaximumSubArraySum {
    public int maxSubArraysSum(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0){
            return -1;
        }
        return numbers[0];
    }
}
