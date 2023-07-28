package emptysquareseqence;

public class EmptySquareSequence {
    public int emptySq(int step) {
        if (step<= 0) {
            throw new InvalidInputException();
        }
        return (step + step) * (step + step) - (step * 4) ;
    }

    public class InvalidInputException extends RuntimeException {
    }
}
