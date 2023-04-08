package Core.Models.Menu;

import Core.Enums.Menu.CreateMenuEnum;
import Core.Enums.Menu.DeleteMenuEnum;
import Core.Interfaces.IMenu;
import Core.Enums.Menu.BaseMenuEnum;
import Core.Enums.Menu.UtilitiesMenuEnum;
import Core.Interfaces.IMenuEnum;

import java.util.Scanner;

public class Menu implements IMenu {
    BaseMenuEnum baseEnum;
    private final CreateMenu createMenu;
    private final DeleteMenu deleteMenu;
    private final UtilitiesMenu utilitiesMenu;
    private Scanner scanner;

    public Menu() {
        createMenu  = new CreateMenu();
        deleteMenu = new DeleteMenu();
        utilitiesMenu = new UtilitiesMenu();
        scanner = new Scanner(System.in);
    }



    public void HandleLogic(int input) {
        var g = BaseMenuEnum.values()[input];

        switch (g) {
            case Invalid ->
                System.exit(0);
            case Create ->
                HandleMenuLoop(createMenu, CreateMenuEnum.class);
            case Delete ->
                HandleMenuLoop(deleteMenu, DeleteMenuEnum.class);
            case Utilities ->
                HandleMenuLoop(utilitiesMenu, UtilitiesMenuEnum.class);
        }
    }

    public <T extends Enum<T> & IMenuEnum> void HandleMenuLoop(IMenu menu, Class<T> element) {
        menu.DisplayMenu(element);
        var input = scanner.nextInt();
        menu.HandleLogic(input);
    }
}
