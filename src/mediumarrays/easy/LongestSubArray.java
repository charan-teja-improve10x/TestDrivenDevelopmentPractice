package mediumarrays.easy;

public class LongestSubArray {
    public int findTheLongestSubArrayWithGivenSum(int[] numbers, int sum) {
        if (numbers == null|| numbers.length ==0){
            return 0;
        } else if (numbers.length == 1 && numbers[0] == sum) {
            return 1;
        }
        return 0;
    }
}
