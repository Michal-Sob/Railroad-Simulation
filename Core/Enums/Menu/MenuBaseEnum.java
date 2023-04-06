package Core.Enums.Menu;

public enum MenuBaseEnum {
    Invalid("Błąd"),
    Create("Utwórz"),
    Delete("Usuń"),
    Utilities("Inne");

    private String name;

    MenuBaseEnum(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
