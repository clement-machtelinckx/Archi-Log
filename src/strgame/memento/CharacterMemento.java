package strgame.memento;

// Classe Memento pour enregistrer l'état d'un personnage
public class CharacterMemento {
    // par défaut cette classe va servir à créer un memento qui sera comme un backup du personnage à un instant t
    // on pourrait conserver l'état complet du personnage dans un cas pratique plus concret, ici on se contentera de ses points de vie
    private final int healthPoints;

    public CharacterMemento(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
