package mediumarrays.maximumsubarraysum;

public class MaximumSubArraySum {
    public int maxSubArraysSum(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0){
            return -1;
        }else {
            int maxi = Integer.MIN_VALUE;
            n = numbers.length;
            for (int i = 0; i < n; i++){
                int sum = 0;
                for (int j = i; j< n; j++){
                    sum += numbers[j];
                    maxi = Math.max(maxi, sum);
                }
            }
            return maxi;
        }

    }
}
