package stringseasy;

public class LargestOddNumber {
    public String findLargestOddNUmber(String num) {
        if (num != null && !num.equals("")) {
            String number = num.trim();
            for (int i = number.length() - 1; i >= 0; i--) {
                if (number.charAt(i) % 2 != 0) {
                    return number.substring(0, i + 1);
                }
            }
        }
        return "";
    }
}
