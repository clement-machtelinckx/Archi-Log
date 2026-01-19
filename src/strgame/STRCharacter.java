package strgame;

import strgame.memento.CharacterMemento;
import strgame.observer.Observer;
import strgame.state.State;
import strgame.strategy.CombatBehavior;

import java.util.ArrayList;
import java.util.List;

public class STRCharacter {
    private int healthPoints;

    private State state;

    private CombatBehavior combatBehavior;

    private final List<Observer> observers = new ArrayList<>();

    public STRCharacter() {
        state = null;
        healthPoints = 20;
        combatBehavior = null;
    }

    /** STRATEGY */
    public void setCombatBehavior(CombatBehavior cb) {
        this.combatBehavior = cb;
    }

    public void performCombat() {
        if (combatBehavior != null) {
            combatBehavior.execute();
        }
    }

    /** OBSERVER */
    public void addObserver(Observer o) {
        if (o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    /** STATE */
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    /** MEMENTO */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public CharacterMemento saveStateToMemento() {
        return new CharacterMemento(healthPoints);
    }

    public void restaureHPFromMemento(CharacterMemento memento) {
        if (memento != null) {
            this.healthPoints = memento.getHealthPoints();
        }
    }
}
