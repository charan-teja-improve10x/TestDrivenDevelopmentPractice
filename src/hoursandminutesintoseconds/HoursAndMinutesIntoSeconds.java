package hoursandminutesintoseconds;

public class HoursAndMinutesIntoSeconds {
    public static void main(String[] args) {
        System.out.println(convert(-1, 10));
    }
    public static long convert(int hours, int minutes) {
        long  result = 0;
        if (hours== 0 && minutes == 0){
            result = 0;
        } else {
            result = hours * 60 * 60 + minutes * 60;
        }
        return result;
    }
}
