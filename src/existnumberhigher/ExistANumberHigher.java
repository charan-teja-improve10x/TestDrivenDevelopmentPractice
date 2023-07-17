package existnumberhigher;

public class ExistANumberHigher {

    public boolean findTheExistNumber(int[] numbers, int number) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (number <= numbers[i]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
