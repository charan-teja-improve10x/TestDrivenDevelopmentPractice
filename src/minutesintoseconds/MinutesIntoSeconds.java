package minutesintoseconds;

public class MinutesIntoSeconds {

    public static void main(String[] args) {
        System.out.println(convert(0));
    }
    public static long convert(int minutes) {
        long result = 0;
        if (minutes != 0){
            result = minutes * 60;
        }
        return result;
    }
}
