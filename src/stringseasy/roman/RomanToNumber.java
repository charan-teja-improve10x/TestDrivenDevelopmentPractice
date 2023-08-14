package stringseasy.roman;

import java.util.HashMap;

public class RomanToNumber {
    public int romanToInt(String num) {
        if (num == null || num.isEmpty()){
            return 0;
        }else if (num.contains("I") || num.contains("V") || num.contains("X") || num.contains("L") || num.contains("C") || num.contains("D") || num.contains("M")){
            HashMap<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            int result = 0;
            int n = num.length();
            for (int i = 0; i < n; i++){
                int currentValue = romanMap.get(num.charAt(i));
                if (i < n - 1 && currentValue < romanMap.get(num.charAt(i + 1))) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            }
            return result;
        }else {
            return 0;
        }
    }
}
