package Core.Enums.Menu;

public enum MenuUtilitiesEnum {
    Invalid("Błąd"),
    AddWagonsToLocomotive("Dodaj wagony do lokomotywy"),
    AddPassengers("Dodaj pasażerów"),
    RemovePassengers("Usuń pasażerów"),
    AddFreight("Dodaj ładunek"),
    RemoveFreight("Usuń ładunek");

    private String name;

    MenuUtilitiesEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
