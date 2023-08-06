package missingnumber;

public class MissingNumberArray {
    public int findTheMissingNumber(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0){
            return 0;
        }
        n = numbers.length;
        if (n == 1){
            return numbers[0];
        }
        return numbers[0];
    }
}
