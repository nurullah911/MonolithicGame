package combat;

public interface Combatant {
    void takeDamage(int damage);
    int getHealth();
    int getDamage();
    String getName();

    // Default attack method: attacker deals its damage to the target.
    default void attack(Combatant target) {
        target.takeDamage(getDamage());
        System.out.println(getName() + " attacks " + target.getName() +
                " for " + getDamage() + " damage.");
    }
}
