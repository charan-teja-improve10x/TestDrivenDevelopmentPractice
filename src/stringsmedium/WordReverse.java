package stringsmedium;

public class WordReverse {
    public String reverseWords(String word) {
        if (word == null || word.equals("")){
            return "";
        }else {
            String[] words = word.split("\\s+");
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length-1; i >= 0; i--){
                reversed.append(words[i]);
                if (i > 0){
                    reversed.append(" ");
                }
            }
            return reversed.toString();
        }
    }
}
