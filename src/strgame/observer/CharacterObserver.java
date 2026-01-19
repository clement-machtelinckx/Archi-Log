package strgame.observer;

// Classe concrète pour un observateur
public class CharacterObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Observé : " + event);
    }
}
