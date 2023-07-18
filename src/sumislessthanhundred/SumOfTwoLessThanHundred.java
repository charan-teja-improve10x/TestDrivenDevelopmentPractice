package sumislessthanhundred;

public class SumOfTwoLessThanHundred {

    public boolean sumIsLessThanHundred(int i, int n) {
        boolean result = false;
        if (i + n < 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
