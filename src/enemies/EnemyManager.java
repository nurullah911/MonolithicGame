package enemies;

import java.util.ArrayList;
import java.util.List;

public class EnemyManager {
    private List<Enemy> enemies;

    public EnemyManager() {
        enemies = new ArrayList<>();
    }

    public void spawnEnemy(Enemy enemy) {
        enemies.add(enemy);
        System.out.println(enemy.getName() + " spawned.");
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void removeDefeatedEnemies() {
        enemies.removeIf(enemy -> enemy.getHealth() <= 0);
    }
}

