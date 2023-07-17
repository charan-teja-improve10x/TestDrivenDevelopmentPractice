package integerinrange;

public class IntegerInRange {
    public boolean findIntegerRange(int num, int lowerBounds, int upperBounds) {
        boolean result = false;
        if (num == 0 && lowerBounds == 0 && upperBounds == 0) {
            result = false;
        } else if (num >= lowerBounds && num < upperBounds) {
            result = true;
        }
        return result;
    }
}
