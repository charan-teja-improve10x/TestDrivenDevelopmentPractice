package templerun;

public class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.health = health;
        this.name = name == null ? "" : name;
    }

    public String getName() {
        return name.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void reduceHealth(int damage){
        health = health - damage;
    }

}
