package Core.Enums.Menu;

public enum MenuDeleteEnum {
    Invalid("Błąd"),
    DeleteLocomotive("Lokomotywę"),
    DeleteWagon("Wagon"),
    DeleteWagons("Wiele Wagonów"),
    DeleteStation("Stację"),
    DeleteStations("Wiele stacji"),
    DeleteConnections("Połączenia");

    private String name;

    MenuDeleteEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
