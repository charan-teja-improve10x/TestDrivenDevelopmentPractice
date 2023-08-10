package mediumarrays;

public class CountSubArrays {
    public int findTheSubArraysWithGivenSum(int[] numbers, int k) {
        if (numbers == null || numbers.length == 0){
            return -1;
        } else if (numbers[0] == k) {
            return 1;
        }else {
            int n = numbers.length;
            int count = 0;
            for (int i = 0; i < n; i++){
                int sum = 0;
                for (int j = i; j < n; j++){
                    sum +=numbers[j];
                    if (sum == k){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
