package farmproblem;

public class Animal {
    public int totalLegsCount(int chickens, int cows, int pigs) {
        int totalLegs = 0;
        if (chickens == -1 || cows == -1 || pigs == -1) {
            totalLegs = -1;
        } else {
            totalLegs = chickens * 2 + (cows + pigs) * 4;
        }
        return totalLegs;
    }
    }
