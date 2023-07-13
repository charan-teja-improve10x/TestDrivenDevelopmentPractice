package nameinverter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public String inverterName(String name) {
        if (name.equals("")) {
            return "";
        } else if (isSingleWord(name)) {
            return name.trim();
        } else {
            return formattedMultiElementName(name);
        }
    }

    private static boolean isSingleWord(String name) {
        return !name.trim().contains(" ");
    }

    private static String formattedMultiElementName(String name) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
        removeHonorifics(names);
        String postNominal = getPostNominal(names.subList(2, names.size()));
        return (names.get(1) + ", " + names.get(0) + " " + postNominal).trim();
    }

    private static String getPostNominal(List<String> names) {
        String postNominal = "";
        for (int i = 0; i < names.size(); i++) {
            postNominal += names.get(i) + " ";
        }
        return postNominal;
    }

    private static void removeHonorifics(ArrayList<String> postNominalList) {
        if (postNominalList.get(0).matches("Mrs.|Mr.|Miss.") && postNominalList.size() > 2)
            postNominalList.remove(0);
    }
}