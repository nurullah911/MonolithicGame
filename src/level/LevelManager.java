package level;

import enemies.EnemyManager;
import player.Player;
import score.ScoreManager;

public class LevelManager {
    private int currentLevel;

    public LevelManager() {
        currentLevel = 1;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void levelUp(Player player, EnemyManager enemyManager, ScoreManager scoreManager) {
        currentLevel++;
        System.out.println("Level Up! Now at level " + currentLevel);
        // Clear current enemies and prepare for the new level
        enemyManager.getEnemies().clear();
        // Award bonus score for leveling up
        scoreManager.addScore(100);
        // Additional level-up logic (e.g., increasing difficulty) can be added here.
    }
}
