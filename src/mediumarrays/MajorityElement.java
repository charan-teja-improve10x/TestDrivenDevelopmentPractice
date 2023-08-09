package mediumarrays;

import java.util.Arrays;

public class MajorityElement {

    public static int getMajorityElement(int[]elements) {
        if (elements != null && elements.length != 0) {
            int n = elements.length;
            for (int i = 0; i < n; i++) {// 2, 2, 1, 1, 1, 2, 2
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (elements[i] == elements[j]) {//2, 2, 1, 1, 1, 2, 2
                        count++;
                    }
                }
                if (count > n / 2) {
                    return elements[i];
                }
            }
        }
        return -1;
    }
}
