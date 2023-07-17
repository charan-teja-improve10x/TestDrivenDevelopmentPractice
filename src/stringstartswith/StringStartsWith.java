package stringstartswith;

public class StringStartsWith {
    public boolean isStartsWith(String name, String prefix) {
        boolean result = false;
        if (name.equals("")){
            result = false;
        }else if (name.trim().startsWith(prefix)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
