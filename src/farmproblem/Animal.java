package farmproblem;

public class Animal {
    public int totalLegsCount(int chickens, int cows, int pigs) {
        int totalLegs = 0;
        totalLegs = chickens * 2 + (cows +  pigs) * 4;
        return totalLegs;
    }
}
