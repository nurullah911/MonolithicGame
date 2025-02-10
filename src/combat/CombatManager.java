package combat;
public class CombatManager {
    public void startCombat(Combatant c1, Combatant c2) {
        System.out.println("Starting combat between " + c1.getName() +
                " (Health: " + c1.getHealth() + ", Damage: " + c1.getDamage() + ") and " +
                c2.getName() + " (Health: " + c2.getHealth() + ", Damage: " + c2.getDamage() + ")");

        while (c1.getHealth() > 0 && c2.getHealth() > 0) {
            c1.attack(c2);
            if (c2.getHealth() <= 0) {
                System.out.println(c2.getName() + " is defeated by " + c1.getName() + "!");
                break;
            }
            c2.attack(c1);
            if (c1.getHealth() <= 0) {
                System.out.println(c1.getName() + " is defeated by " + c2.getName() + "!");
                break;
            }
        }
    }
}

