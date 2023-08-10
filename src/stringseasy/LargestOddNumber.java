package stringseasy;

public class LargestOddNumber {
    public String findLargestOddNUmber(String num) {
        if (num == null || num.equals("")) {
            return "";
        } else {
            int n = num.trim().length();
            for (int i = n - 1; i >= 0; i--) {
                if (num.trim().charAt(i) % 2 != 0) {
                    return num.trim().substring(0, i + 1);
                }
            }
            return "";
        }
    }
}
