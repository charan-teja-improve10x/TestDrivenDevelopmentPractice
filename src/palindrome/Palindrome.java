package palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
    }
    public static boolean isPalindrome(String name) {
        String reverse = "";
        String wordTrim = name.trim();
        for (int i = wordTrim.length() -1; i >= 0; i--) {
            reverse += wordTrim.charAt(i);
        }

        boolean result = false;
        if (wordTrim != null && wordTrim.equals(reverse)) {
            result = true;
        }else{
                result = false;
            }
        return result;
    }
}
