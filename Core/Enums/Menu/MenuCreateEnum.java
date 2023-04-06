package Core.Enums.Menu;

public enum MenuCreateEnum {
    Invalid("Błąd"),
    CreateLocomotive("Lokomotywę"),
    CreateWagon("Wagon"),
    CreateWagons("Wiele Wagonów"),
    CreateStation("Stację"),
    CreateConnections("Wiele stacji"),
    AddWagonsToLocomotive("Połączenia");

    private String name;

    MenuCreateEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}



