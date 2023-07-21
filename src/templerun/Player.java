package templerun;

public class Player extends Character {
    String name;
    int score;
    int health;
    public Player(String name, int health){
        super(name, health);

    }

    public Player(String name){
        super(name);

    }

    public Player(int health){
        super(health);

    }

    @Override
    public String getName() {
        if (name == null || name == ""){
            return "";
        }
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
