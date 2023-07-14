package sumislessthanhundred;

public class SumOfTwoLessThanHundred {

    public static void main(String[] args) {
        System.out.println(sumIsLessThanHundred(-1,-1));
    }
    public static boolean sumIsLessThanHundred(int i, int n) {
        boolean result = false;
        if (i + n == 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
