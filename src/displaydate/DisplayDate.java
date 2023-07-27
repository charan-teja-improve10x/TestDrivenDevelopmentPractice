package displaydate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayDate {
    public static void main(String[] args) {
        DisplayDate displayDate = new DisplayDate();
        String result = displayDate.getDisplayDate(860697000000l);
        System.out.println(result);
    }


    public  String getDisplayDate(long secondsInMills) {
        Calendar instantCal = Calendar.getInstance();
        instantCal.setTimeInMillis(secondsInMills);
        Calendar currentCal = Calendar.getInstance();
        if (isSameDay(instantCal, currentCal)){
            return "Today";
        }
        currentCal.add(Calendar.DAY_OF_MONTH, -1);
        if (isSameDay(instantCal, currentCal)){
            return "Yesterday";
        }

        int inputYear = instantCal.get(Calendar.YEAR);
        int currentYear = currentCal.get(Calendar.YEAR);
        SimpleDateFormat dateFormat;
        if (inputYear == currentYear){
            dateFormat = new SimpleDateFormat("dd MMM");
            return dateFormat.format(instantCal.getTime());
        } else if (inputYear != currentYear) {
            dateFormat = new SimpleDateFormat("dd MMM YYYY");
            return dateFormat.format(instantCal.getTime());
        }else {
            throw new InvalidTimeStampException();
        }
    }

    private static boolean isSameDay(Calendar instantCal, Calendar currentCal) {
        return instantCal.get(Calendar.YEAR) == currentCal.get(Calendar.YEAR) && instantCal.get(Calendar.DAY_OF_MONTH) == currentCal.get(Calendar.DAY_OF_MONTH);
    }

    public class InvalidTimeStampException extends RuntimeException {}
}
