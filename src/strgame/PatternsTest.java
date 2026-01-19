package strgame;

import strgame.memento.Caretaker;
import strgame.observer.CharacterObserver;
import strgame.observer.Observer;
import strgame.state.NormalState;
import strgame.state.State;
import strgame.state.WoundedState;
import strgame.strategy.AggressiveBehavior;
import strgame.strategy.DefensiveBehavior;
import strgame.strategy.FleeBehavior;


// Classe de test principale
public class PatternsTest {
    public static void main(String[] args) {

        // Personnage du jeu
        STRCharacter warrior = new STRCharacter();

        /* Test du pattern Strategy */
        System.out.println("Test du pattern Strategy:");
        warrior.setCombatBehavior(new AggressiveBehavior());
        warrior.performCombat(); // affiche : Attaque agressive!
        warrior.setCombatBehavior(new DefensiveBehavior());
        warrior.performCombat(); // affiche : Défense renforcée!
        warrior.setCombatBehavior(new FleeBehavior());
        warrior.performCombat(); // affiche : Fuite rapide!

        /* Test du pattern Observer */
        System.out.println("\nTest du pattern Observer:");
        Observer observer = new CharacterObserver();
        warrior.addObserver(observer);
        warrior.notifyObservers("Un ennemi approche"); // affiche : Observé : Un ennemi approche
        warrior.notifyObservers("Un allié a besoin d'aide"); // affiche : Observé : Un allié a besoin d'aide

        // Test du pattern Memento
        System.out.println("\nTest du pattern Memento:");
        Caretaker caretaker = new Caretaker();
        warrior.setHealthPoints(25);
        System.out.println(warrior.getHealthPoints()+" PV"); // affiche : 25 PV
        caretaker.addMemento(warrior.saveStateToMemento());
        warrior.setHealthPoints(12);
        System.out.println(warrior.getHealthPoints()+" PV"); // affiche : 12 PV
        caretaker.addMemento(warrior.saveStateToMemento());
        warrior.restaureHPFromMemento(caretaker.getMemento(0));
        System.out.println(warrior.getHealthPoints()+" PV"); // affiche : 25 PV

        // Test du pattern State
        System.out.println("\nTest du pattern State:");
        State normal = new NormalState();
        State wounded = new WoundedState();
        normal.doAction(warrior); // affiche : "Personnage en état normal", puis "Attaque agressive!"
        wounded.doAction(warrior); // affiche : "Personnage blessé", puis "Fuite rapide!"

    }
}