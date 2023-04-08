package Core.Models.Menu;

import Core.Enums.Menu.UtilitiesMenuEnum;
import Core.Interfaces.IMenu;

import java.util.UUID;

public class UtilitiesMenu implements IMenu {
    UtilitiesMenuEnum utilitiesEnum;

    @Override
    public void HandleLogic(int input) {
        var g = UtilitiesMenuEnum.values()[input];
        switch (g) {
            case Invalid -> {
                return;
            }
            case AddWagonsToLocomotive -> {
            }
            case AddPassengers -> {
            }
            case RemovePassengers -> {
            }
            case AddFreight -> {
            }
            case RemoveFreight -> {
            }
        }
    }

    public void AddWagonsToLocomotive(UUID[] wagonId, UUID locomotiveId) {

    }

    public void AddPassengers(UUID wagonId) {

    }

    public void RemovePassengers(UUID wagonId) {

    }

    public void AddFreight(UUID wagonId) {

    }

    public void RemoveFreight(UUID wagonId) {

    }
}
