package Core.Interfaces;

import Core.Models.Menu.Menu;

import java.util.EnumSet;

public interface IMenu {
    default <T extends Enum<T> & IMenuEnum> void DisplayMenu(Class<T> element) {
        for (var i : EnumSet.allOf(element))
            System.out.println(i.ordinal() + ". " + i.GetName());
    }

    void HandleLogic(int input);
}
