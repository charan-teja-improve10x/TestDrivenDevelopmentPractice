package displaydate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayDate {

    public String getDisplayDate(long secondsInMills) {
        if (secondsInMills <= 0) {
            throw new InvalidTimeStampException();
        }
        Calendar instantCal = Calendar.getInstance();
        instantCal.setTimeInMillis(secondsInMills);
        Calendar currentCal = Calendar.getInstance();
        if (isSameDay(instantCal, currentCal)) {
            return "Today";
        }
        currentCal.add(Calendar.DAY_OF_MONTH, -1);
        if (isSameDay(instantCal, currentCal)) {
            return "Yesterday";
        }

        int inputYear = instantCal.get(Calendar.YEAR);
        int currentYear = currentCal.get(Calendar.YEAR);
        SimpleDateFormat dateFormat;
        if (inputYear == currentYear) {
            dateFormat = new SimpleDateFormat("dd MMM");
        } else {
            dateFormat = new SimpleDateFormat("dd MMM YYYY");
        }
        return dateFormat.format(instantCal.getTime());
    }

    private static boolean isSameDay(Calendar instantCal, Calendar currentCal) {
        return instantCal.get(Calendar.YEAR) == currentCal.get(Calendar.YEAR) &&
                instantCal.get(Calendar.DAY_OF_MONTH) == currentCal.get(Calendar.DAY_OF_MONTH);
    }

    public class InvalidTimeStampException extends RuntimeException {
    }
}
