package Core.Enums.Menu;

import Core.Interfaces.IMenuEnum;

public enum DeleteMenuEnum implements IMenuEnum {
    Invalid("Cofnij"),
    DeleteLocomotive("Lokomotywę"),
    DeleteWagon("Wagon"),
    DeleteWagons("Wiele Wagonów"),
    DeleteStation("Stację"),
    DeleteStations("Wiele stacji"),
    DeleteConnections("Połączenia");

    private String name;

    DeleteMenuEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
