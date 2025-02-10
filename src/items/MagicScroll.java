package items;

import player.Player;

public class MagicScroll implements Item {
    private int bonusDamage;

    public MagicScroll(int bonusDamage) {
        this.bonusDamage = bonusDamage;
    }

    @Override
    public void applyEffect(Player player) {
        int newDamage = player.getDamage() + bonusDamage;
        player.setDamage(newDamage);
        System.out.println("MagicScroll applied: Player's damage increased by " + bonusDamage);
    }
}
