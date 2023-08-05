package largestnumber;

public class LargestNumber {
    public int findTheLargeNUmber(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return 0;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
