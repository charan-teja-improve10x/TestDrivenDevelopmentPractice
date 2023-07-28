package specialarray;

public class SpecialArray {
    public Boolean isSpecialArray(Integer[] numbers) {
        if (numbers == null || numbers.length < 1){
            throw new InvalidArrayException();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != numbers[i] % 2) {
                return false;
            }
        }
        return true;
    }

    public class InvalidArrayException extends RuntimeException{
    }
}
