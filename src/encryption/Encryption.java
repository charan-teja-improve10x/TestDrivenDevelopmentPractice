package encryption;

public class Encryption {
    public String encrypt(String word) {
        String result = "";
        if (word == null || word.equals("")) {
            return "aca";
        } else {
            String reverse = "";
            for (int i = word.trim().length() - 1; i >= 0; i--) {
                reverse = reverse + word.trim().charAt(i);
            }
            char[] replacedVowels = reverse.toCharArray();
            for (int i = 0; i < reverse.length(); i++) {
                if (reverse.charAt(i) == 'a' || reverse.charAt(i) == 'A') {
                    replacedVowels[i] = '0';
                } else if (reverse.charAt(i) == 'e' || reverse.charAt(i) == 'E') {
                    replacedVowels[i] = '1';
                } else if (reverse.charAt(i) == 'i' || reverse.charAt(i) == 'I') {
                    replacedVowels[i] = '2';
                } else if (reverse.charAt(i) == 'o' || reverse.charAt(i) == 'O') {
                    replacedVowels[i] = '3';
                } else if (reverse.charAt(i) == 'u' || reverse.charAt(i) == 'U') {
                    replacedVowels[i] = '4';
                }
            }
            String replace = String.valueOf(replacedVowels);
            result = replace + "aca";
            return result;
        }
    }
}
