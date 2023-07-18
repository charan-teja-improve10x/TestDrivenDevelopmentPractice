package nthevennumber;

public class NthEvenNumber {
    public int findTheNthEvenNumber(int number) {
        int result = 0;
        if (number < 0){
            result= -2;
        } else if (number == 0 || number == 1) {
            result = 0;
        } else {
            result = (number - 1) * 2;
        }
        return result;
    }
}
