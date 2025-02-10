package enemies;

public class Vampire implements Enemy {
    private int health;
    private int damage;
    private final String name = "Vampire";

    public Vampire(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
