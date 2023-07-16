package existnumberhigher;

public class ExistANumberHigher {
    public static void main(String[] args) {
        int[] numbers = {-1, -2, -3, -4};
        System.out.println(findTheExistNumber(numbers, 0));
    }
    public static boolean findTheExistNumber(int[] numbers, int number) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++){
            if (number <= numbers[i]){
                result = true;
                break;
            }
        }
        return result;
    }
}
