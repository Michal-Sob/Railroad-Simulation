package Core.Enums.Menu;

import Core.Interfaces.IMenuEnum;

public enum BaseMenuEnum implements IMenuEnum {
    Invalid("Zamknij"),
    Create("Utwórz"),
    Delete("Usuń"),
    Utilities("Inne");

    private String name;

    BaseMenuEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}

