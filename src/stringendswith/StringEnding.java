package stringendswith;

public class StringEnding {
    public boolean checkStringEnding(String name, String suffix) {
        boolean result = false;
        if (name == null) {
            result = false;
        } else if (name.trim().endsWith(suffix)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
