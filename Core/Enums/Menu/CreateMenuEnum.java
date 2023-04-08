package Core.Enums.Menu;

import Core.Interfaces.IMenuEnum;

public enum CreateMenuEnum implements IMenuEnum {
    Invalid("Cofnij"),
    CreateLocomotive("Lokomotywę"),
    CreateWagon("Wagon"),
    CreateWagons("Wiele Wagonów"),
    CreateStation("Stację"),
    CreateConnections("Wiele stacji"),
    AddWagonsToLocomotive("Połączenia");

    private String name;

    CreateMenuEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}



