package minutesintoseconds;

public class MinutesIntoSeconds {


    public long convert(int minutes) {
        long result = 0;
        if (minutes < 0){
            result = -1;
        } else if (minutes != 0) {
            result = minutes * 60;
        }
        return result;
    }
}
