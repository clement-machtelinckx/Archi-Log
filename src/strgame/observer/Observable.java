package strgame.observer;

// Interface pour les sujets observables
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String event);
}