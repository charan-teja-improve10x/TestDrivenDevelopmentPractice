package secondlargetsnumber;

public class SecondLargestNumber {
    public int findTheSecondLargestNumber(int[] numbers) {
        if (numbers == null ||  numbers.length < 2){
            return -1;
        }

        int largeNumber = Integer.MIN_VALUE;
        int secondLargeNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > largeNumber){
                secondLargeNumber = largeNumber;
                largeNumber = numbers[i];
            }else if (numbers[i] > secondLargeNumber && numbers[i] < largeNumber) {
                secondLargeNumber = numbers[i];
            }
        }

        if (secondLargeNumber == Integer.MIN_VALUE){
            return 0;
        }

        return secondLargeNumber;
    }
}
