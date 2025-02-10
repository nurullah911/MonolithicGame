package items;

import player.Player;

public class HealthPotion implements Item {
    private int healAmount;

    public HealthPotion(int healAmount) {
        this.healAmount = healAmount;
    }

    @Override
    public void applyEffect(Player player) {
        int newHealth = player.getHealth() + healAmount;
        player.setHealth(newHealth);
        System.out.println("Player healed for " + healAmount + " points. New health: " + newHealth);
    }
}

