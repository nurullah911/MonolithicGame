package player;

import combat.Combatant;
public class Player implements Combatant {
    private int health;
    private int damage;
    private Inventory inventory;

    public Player(int health, int experience, int damage) {
        this.health = health;
        this.damage = damage;
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    // Combatant methods
    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Player takes " + damage + " damage. Remaining health: " + health);
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String getName() {
        return "Player";
    }
}
