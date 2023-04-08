package Core.Enums.Menu;

import Core.Interfaces.IMenuEnum;

public enum UtilitiesMenuEnum implements IMenuEnum {
    Invalid("Cofnij"),
    AddWagonsToLocomotive("Dodaj wagony do lokomotywy"),
    AddPassengers("Dodaj pasażerów"),
    RemovePassengers("Usuń pasażerów"),
    AddFreight("Dodaj ładunek"),
    RemoveFreight("Usuń ładunek");

    private final String name;

    UtilitiesMenuEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
