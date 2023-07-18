package threeprogrammers;

public class ThreeProgrammer {

    public int findTheDifference(int programmerOne, int programmerTwo, int programmerThree) {
        int difference = 0;
        if (programmerOne < 0 || programmerTwo < 0 || programmerThree < 0) {
            difference = -1;
        } else if (programmerOne > 0 && programmerTwo > 0 && programmerThree > 0) {
            int maxValue = findMax(programmerOne, programmerTwo, programmerThree);
            int minValue = findMin(programmerOne, programmerTwo, programmerThree);
            difference = maxValue - minValue;
        }
        return difference;
    }

    private static int findMin(int programmerOne, int programmerTwo, int programmerThree) {
        if (programmerOne < programmerTwo && programmerOne < programmerThree) {
            return programmerOne;
        } else if (programmerTwo < programmerThree) {
            return programmerTwo;
        } else {
            return programmerThree;
        }
    }

    private static int findMax(int programmerOne, int programmerTwo, int programmerThree) {
        if (programmerOne > programmerTwo && programmerOne > programmerThree) {
            return programmerOne;
        } else if (programmerTwo > programmerThree) {
            return programmerTwo;
        } else {
            return programmerThree;
        }
    }

}
