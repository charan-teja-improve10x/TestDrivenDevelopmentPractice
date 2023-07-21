package templerun;

import java.util.Random;

public class Player  {
    String name;
    int health;
    int score;
    public Player(String name) {
        this.name = name == null? "" : name.trim();
        this.health = 100;
        this.score = 0;
    }

    public Player(String name, int health) {
        this.name = name == null? "" : name.trim();
        if (health < 0 || health > 100) {
            throw new InvalidHealthException();
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void run() {
        System.out.println("Running...!");
    }

    public int getScore() {
        return score;
    }

    public void collectCoin(Coin coin) {
        score += coin.getValue();
    }

    public void jump() {
        System.out.println(getName() + " jumped to avoid obstacles!");
    }

    public class InvalidHealthException extends RuntimeException {
    }
}
