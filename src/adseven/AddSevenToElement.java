package adseven;

public class AddSevenToElement {
    public String[] addSeven(String[] names) {
        String[] result = new String[names.length];
        if (names.length == 0){
            return new String[0];
        } else if (names.length >= 1) {
            for (int i = 0; i < names.length; i++){
                if (names[i].charAt(names[i].length() -1) != '7'){
                    result[i] = names[i] + "7";
                }else {
                    result[i] = names[i];
                }
            }
        }

        return result;
    }
}
