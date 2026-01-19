package strgame.state;

import strgame.STRCharacter;
import strgame.strategy.FleeBehavior;

public class WoundedState implements State {
    @Override
    public void doAction(STRCharacter context) {
        System.out.println("Personnage blessé");
        context.setState(this);
        context.setCombatBehavior(new FleeBehavior());
        context.performCombat();
    }
}
