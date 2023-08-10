package stringseasy.anagram;

public class Anagram {
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")){
            return false;
        } else if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i< str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
