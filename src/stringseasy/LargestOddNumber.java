package stringseasy;

public class LargestOddNumber {
    public String findLargestOddNUmber(String num) {
        if (num == null || num.length() == 0) {
            return "";
        } else {
            for (int i = num.length() - 1; i >= 0; i--) {
                if (num.charAt(i) % 2 != 0) {
                    return num.substring(0, i + 1);
                }
            }
            return "";
        }
    }
}
