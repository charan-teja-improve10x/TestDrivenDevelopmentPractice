package templerun;

public class Obstacle {

    protected String name;
    protected int damage;

    public Obstacle(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void collide(Player player){
        System.out.println(name + " has Collide with " + player.getName() + " and caused " + damage + " damage.");
        player.healthDamage(damage);
    }
}
