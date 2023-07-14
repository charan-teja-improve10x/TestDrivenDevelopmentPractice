package factorial;

public class Factorial {

    public static void main(String[] args) {
        //System.out.println(calculateFactorial(6));
        System.out.println(findFactorial(6));
    }
    public static int calculateFactorial(int number) {
        int result = 0;
        if (number < 0){
            result = -1;
        } else if (number == 2) {
            result= 2;
        }else {
            result = number * calculateFactorial(number - 1);
        }
        return result;
    }

    public static int findFactorial(int n) {
        int fact = 1;
        if (n > -1){
            for ( int i = n; i > 1; i --){
                fact *= i;
            }
        } else {
            fact = -1;
        }
        return fact;
    }
}
