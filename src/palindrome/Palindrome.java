package palindrome;

public class Palindrome {


    public boolean isPalindrome(String name) {
        String reverse = "";
        String wordTrim = name.trim();
        for (int i = wordTrim.length() - 1; i >= 0; i--) {
            reverse += wordTrim.charAt(i);
        }

        boolean result = false;
        if (wordTrim.equals("")) {
            result = true;
        } else if (wordTrim.equals(reverse)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
