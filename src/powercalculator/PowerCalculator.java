package powercalculator;

public class PowerCalculator {
    public int calculate(int voltage, int current) {
        int power = 0;
        power = voltage * current;
        return power;
    }
}
