package divisiblebyfive;

public class DivisibleByFive {

    public static void main(String[] args) {
        System.out.println(division(0));
    }
    public static boolean division(int n) {
        boolean result = false;
        if (n % 5 == 0){
           result = true;
        }else {
            result = false;
        }
        return result;
    }
}
