package strgame.strategy;

public class DefensiveBehavior implements CombatBehavior {
    @Override
    public void execute() {
        System.out.println("Défense renforcée!");
    }
}
