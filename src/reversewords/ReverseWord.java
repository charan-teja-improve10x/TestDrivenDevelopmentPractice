package reversewords;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWord {
    public String reverseString(String word) {
        if (word == null || word == ""){
            return "";
        } else if (!word.trim().contains(" ")) {
            return word.trim();
        }else {
            ArrayList<String> words = new ArrayList<>(Arrays.asList(word.trim().split("\\s+")));
            return words.get(1) + " " + words.get(0);
        }
    }
}
