package strgame.state;

import strgame.STRCharacter;
import strgame.strategy.FleeBehavior;

public class WoundedState implements State {
    public void doAction(STRCharacter context) {
        System.out.println("A compléter d'après la classe de Test");
        context.setState(this);
        // TODO: quand le personnage passe dans cet état, le personnage passe automatiquement en fuite
    }
}