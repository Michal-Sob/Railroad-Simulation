package View;

import Core.Enums.Menu.BaseMenuEnum;
import Core.Models.Menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        var menu = new Menu();

        while (true) {
            menu.DisplayMenu(BaseMenuEnum.class);
            menu.HandleLogic(scanner.nextInt());
        }
    }
}
