package templerun;

public class SpikePit extends Obstacle{

    private int width;

    public SpikePit(int width) throws InvalidObstacleDamageException {
        super("SpikePit", 50);
        if (width < 0 || width > 20) {
            throw new InvalidSpikePitException();
        }
        this.width = width;

    }



    public void trap(Player player) {
        System.out.println("SpikePit is trapped with " + width + " meters width!");
        player.healthDamage(damage);
    }

    public class InvalidSpikePitException extends RuntimeException {
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
