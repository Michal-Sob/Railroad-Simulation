package Core.Models.Menu;

import Core.Enums.Menu.CreateMenuEnum;
import Core.Interfaces.IMenu;
import Core.Models.Locomotive;
import Core.Models.Station;
import Core.Models.Wagons.Wagon;

import java.util.List;

public class CreateMenu implements IMenu {
    CreateMenuEnum createEnum;

    public CreateMenu() {
    }

    @Override
    public void HandleLogic(int input) {

    }

    public Locomotive CreateLocomotive() {
        return null;
    }

    public Wagon CreateWagon() {
        return null;
    }

    public List<Wagon> CreateWagons(int quantity) {
        return null;
    }

    public Station CreateStation() {
        return new Station();
    }

    public void CreateConnections(List<Station> stations, int connectionsPerStation) {

    }
}
