package strgame.state;

import strgame.STRCharacter;
import strgame.strategy.AggressiveBehavior;

// Classe concrète pour un état spécifique
public class NormalState implements State {
    @Override
    public void doAction(STRCharacter context) {
        System.out.println("Personnage en état normal");
        context.setState(this);
        context.setCombatBehavior(new AggressiveBehavior());
        context.performCombat();
    }
}
