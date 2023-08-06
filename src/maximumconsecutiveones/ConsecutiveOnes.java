package maximumconsecutiveones;

public class ConsecutiveOnes {
    public int countOfConsecutiveOnes(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            return 0;
        }

        int maxi = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 1){
                count++;
            }else {
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}
