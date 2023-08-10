package stringseasy.anagram;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")){
            return false;
        } else if (str1.length() != str2.length()) {
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);
        for (int i = 0; i< str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static String sortString(String name){
        char[] c = name.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
