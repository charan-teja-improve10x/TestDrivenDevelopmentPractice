package ageintodays;

public class AgeIntoDays {

    public static void main(String[] args) {
        System.out.println(calculateAgeInDays(2023));
    }
    public static int calculateAgeInDays(int age) {
        int result = 0;
        if (age < 0){
            result = -1;
        } else  {
            result = age * 365;
        }
        return result;
    }
}
