package mediumarrays.easy;

public class LongestSubArray {
    public int findTheLongestSubArrayWithGivenSum(int[] numbers, int sum) {
        if (numbers == null|| numbers.length ==0){
            return 0;
        } else if (numbers.length == 1 && numbers[0] == sum) {
            return 1;
        }else {
            int n = numbers.length;
            int len = 0;
            for (int i = 0; i < n; i++){
                int s= 0;
                for (int j = i; j< n; j++){
                    s+= numbers[j];

                    if (s == sum){
                        len = Math.max(len, j - i + 1);
                    }
                }
            }
            return len;
        }
    }
}
