package twomakesten;

public class TwoMakesTen {
    public static void main(String[] args) {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean message = twoMakesTen.getTwoMakesTen(10,2);
        System.out.println(message);
    }
    public boolean getTwoMakesTen(int i, int n) {
        boolean result = false;
        if (i <= 0 || n <=0) {
            result = false;
        } else if (i == 10 || n == 10){
            result = true;
        } else if (i + n == 10) {
            result = true;
        }
        return result;
    }

}
