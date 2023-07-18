package powercalculator;

public class PowerCalculator {
    public int calculate(int voltage, int current) {
        int power = 0;
        if (voltage <0 || current < 0){
            power = -1;
        }else {
            power = voltage * current;
        }
        return power;
    }
}
