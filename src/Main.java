// File: src/MainGame.java
import enemies.Enemy;
import enemies.EnemyManager;
import enemies.Vampire;
import items.Item;
import items.MagicScroll;
import player.Player;
import combat.CombatManager;
import enemies.Zombie;
import items.ItemManager;
import items.HealthPotion;
import level.LevelManager;
import score.ScoreManager;
import combat.Combatant;

public class Main {
    public static void main(String[] args) {
        CombatManager combatSystem = new CombatManager();
        LevelManager levelManager = new LevelManager();
        ScoreManager scoreManager = new ScoreManager();
        EnemyManager enemyManager = new EnemyManager();
        ItemManager itemManager = new ItemManager();
        Player player = new Player(100, 0, 25);

        MagicScroll scroll = new MagicScroll(10);
        System.out.println("Player picks up a MagicScroll (+10 damage).");
        itemManager.pickupItem(player, scroll);

        Combatant zombie = new Zombie(50, 15);
        Combatant vampire = new Vampire(30, 20);
        combatSystem.startCombat(zombie, vampire);

        Enemy enemy = new Zombie(60, 10);
        combatSystem.startCombat(player, enemy);


        HealthPotion potion = new HealthPotion(30);
        itemManager.pickupItem(player, potion);


        System.out.println("\nLeveling up the player...");
        levelManager.levelUp(player, enemyManager, scoreManager);
        System.out.println("Current Level: " + levelManager.getCurrentLevel());
        System.out.println("Current Score: " + scoreManager.getScore());
        System.out.println("Enemies remaining: " + enemyManager.getEnemies().size());

    }
}

