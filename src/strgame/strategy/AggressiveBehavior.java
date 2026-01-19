package strgame.strategy;

public class AggressiveBehavior implements CombatBehavior {
    @Override
    public void execute() {
        System.out.println("Attaque agressive!");
    }
}
