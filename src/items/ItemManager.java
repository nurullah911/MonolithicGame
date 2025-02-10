package items;

import player.Player;

public class ItemManager {
    public void pickupItem(Player player, Item item) {
        player.getInventory().addItem(item);
        item.applyEffect(player);
        System.out.println("Item picked up and applied.");
    }
}

