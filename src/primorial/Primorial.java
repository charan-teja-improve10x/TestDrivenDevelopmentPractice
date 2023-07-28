package primorial;

public class Primorial {
    public long findThePrimorial(int n) {
        int primorial = 1;
        if (n < 0) {
            primorial = -1;
        } else if (n == 0) {
            primorial = 0;
        } else {
            int primesCount = 0;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (primesCount != n) {
                    int factors = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            factors++;
                        }
                    }
                    if (factors == 2) {
                        primesCount++;
                        primorial *= i;
                    }
                } else {
                    break;
                }
            }
        }
        return primorial;
    }
}
