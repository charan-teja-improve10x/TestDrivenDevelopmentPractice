package templerun;

public class SpikePit {
    private int width;

    public SpikePit(int width) {
        if (width < 0 || width > 20) {
            throw new InvalidSpikePitException();
        }
        this.width = width;
    }

    public void trap() {
        System.out.println("SpikePit is trapped with " + width + " meters width!");
    }

    public class InvalidSpikePitException extends RuntimeException {
    }
}
