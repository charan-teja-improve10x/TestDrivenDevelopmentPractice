package divisiblebyfive;

public class DivisibleByFive {

    public boolean isDivisible(int n) {
        boolean result = false;
        if (n % 5 == 0){
           result = true;
        }else {
            result = false;
        }
        return result;
    }
}
