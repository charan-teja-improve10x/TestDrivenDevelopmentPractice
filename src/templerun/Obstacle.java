package templerun;

public class Obstacle {

    protected String name;
    protected int damage;

    public Obstacle(String name, int damage) throws InvalidObstacleDamageException {
        this.damage = damage;
        this.name = name == null ? "" : name.trim();
        if (damage < 0 || damage > 100) {
            throw new InvalidObstacleDamageException();
        }

    }

    public void collide(Player player){
        System.out.println(name + " has Collide with " + player.getName() + " and caused " + damage + " damage.");
        player.healthDamage(damage);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public class InvalidObstacleDamageException extends Exception {
    }
}
