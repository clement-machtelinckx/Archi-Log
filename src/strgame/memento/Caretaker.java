package strgame.memento;

import java.util.ArrayList;
import java.util.List;

// Classe Caretaker pour gérer les mementos
// Caretaker va conserver l'historique des mementos du personnage
public class Caretaker {
    private final List<CharacterMemento> mementoList = new ArrayList<>();

    public void addMemento(CharacterMemento m) {
        if (m != null) {
            mementoList.add(m);
        }
    }

    public CharacterMemento getMemento(int index) {
        return mementoList.get(index);
    }
}
