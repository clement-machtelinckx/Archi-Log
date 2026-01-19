package strgame.state;

import strgame.STRCharacter;

// Interface pour les différents états d'un personnage
public interface State {
    void doAction(STRCharacter context);
}