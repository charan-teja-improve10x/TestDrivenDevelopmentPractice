package palindrome;

public class Palindrome {

    public boolean isPalindrome(String name) {

        if (name == null) {
            return false;
        } else if (name == "") {
            return true;
        } else if (name.length() == 1) {
            return true;
        } else if (name.length() >= 2) {
            if (reversingTheString(name)) return true;
        }
         return false;
    }

    private static boolean reversingTheString(String name) {
        String reverse = "";
        String trimWord = name.trim();
        for (int i = trimWord.length() - 1; i >= 0; i--) {
            reverse += trimWord.charAt(i);
            if (trimWord.equals(reverse)) {
                return true;
            }
        }
        return false;
    }
}
