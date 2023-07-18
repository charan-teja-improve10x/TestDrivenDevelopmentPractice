package twomakesten;

public class TwoMakesTen {

    public boolean getTwoMakesTen(int i, int n) {
        boolean result = false;
        if (i <= 0 || n <= 0) {
            result = false;
        } else if (i == 10 || n == 10 || i + n == 10) {
            result = true;
        }
        return result;
    }

}
