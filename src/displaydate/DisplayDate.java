package displaydate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayDate {


    public  String getDisplayDate(long secondsInMills) {
        if (secondsInMills <= 0){
            return "0";
        } else if (isCurrentTime(secondsInMills)){
            return "Today";
        } else if (isYesterday(secondsInMills)) {
            return "Yesterday";
        }
        Calendar inputCal = Calendar.getInstance();
        inputCal.setTimeInMillis(secondsInMills);
        Calendar currentCal = Calendar.getInstance();
        currentCal.setTimeInMillis(secondsInMills);
        int instantYear =  inputCal.get(Calendar.YEAR);
        int currentYear = currentCal.get(Calendar.YEAR);
        if (instantYear == currentYear){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM");
            return dateFormat.format(inputCal.getTime());
        } else {
            throw new InvalidTimeStampException();
        }
    }

    private static boolean isYesterday(long secondsInMills) {
        return secondsInMills == System.currentTimeMillis() - 24 * 60 * 60 * 1000;
    }

    private static boolean isCurrentTime(long secondsInMills) {
        return secondsInMills == System.currentTimeMillis();
    }

    public class InvalidTimeStampException extends RuntimeException {}
}
