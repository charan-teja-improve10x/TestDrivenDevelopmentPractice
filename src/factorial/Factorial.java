package factorial;

public class Factorial {


    public static int calculateFactorial(int number) {
        int result = 0;
        if (number < 0) {
            result = -1;
        } else if (number == 0 || number == 1) {
            result = 1;
        } else if (number == 2) {
            result = 2;
        } else {
            result = number * calculateFactorial(number - 1);
        }
        return result;
    }
}
