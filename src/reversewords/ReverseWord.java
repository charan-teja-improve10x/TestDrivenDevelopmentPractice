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
            String[] names = word.trim().split("\\s+");
            StringBuilder reversed = new StringBuilder();
            for (int i = names.length -1; i>= 0; i--){
                reversed.append(names[i]);
                if (i > 0){
                    reversed.append(" ");
                }
            }
            return reversed.toString();
        }
    }
}
