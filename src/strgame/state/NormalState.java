package strgame.state;

import strgame.STRCharacter;
import strgame.strategy.AggressiveBehavior;
import strgame.strategy.FleeBehavior;

// Classe concrète pour un état spécifique
public class NormalState implements State {
    public void doAction(STRCharacter context) {
        System.out.println("A compléter d'après la classe de Test");
        context.setState(this);
        // TODO: quand le personnage passe dans cet état, le personnage passe automatiquement en stratégie aggressive
    }
}