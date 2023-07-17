package threeprogrammers;

public class ThreeProgrammer {

    public static void main(String[] args) {
        System.out.println(findTheDifference(2,3,9));
    }
    public static int findTheDifference(int programmerOne, int programmerTwo, int programmerThree) {
        int difference = 0;
        if (programmerOne > 0 && programmerTwo > 0 && programmerThree > 0){
            int minValue = findTheMinValue(programmerOne, programmerTwo, programmerThree);
            int maxvalue = findTheMaxValue(programmerOne, programmerTwo, programmerThree);
            difference = maxvalue - minValue;
        }
        return difference;
    }

    public static int findTheMaxValue(int pOne, int pTwo, int pThree) {
        if (pOne > pTwo && pOne > pThree){
            return pOne;
        } else if (pTwo > pThree) {
            return pTwo;
        } else {
            return pThree;
        }
    }

    public static int findTheMinValue(int pOne, int pTwo, int pThree) {
        if (pOne < pTwo && pOne < pThree){
            return pOne;
        } else if (pTwo < pThree) {
            return pTwo;
        } else {
            return pThree;
        }
    }
}
