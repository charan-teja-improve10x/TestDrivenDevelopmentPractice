package ageintodays;

public class AgeIntoDays {

    public int calculateAgeInDays(int age) {
        int result = 0;
        if (age < 0) {
            result = -1;
        } else {
            result = age * 365;
        }
        return result;
    }
}
