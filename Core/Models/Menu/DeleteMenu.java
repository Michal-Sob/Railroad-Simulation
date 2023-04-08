package Core.Models.Menu;

import Core.Enums.Menu.DeleteMenuEnum;
import Core.Interfaces.IMenu;
import Core.Models.Station;

import java.util.List;
import java.util.UUID;

public class DeleteMenu implements IMenu {
    DeleteMenuEnum menuDeleteEnum;

    @Override
    public void HandleLogic(int input) {

    }


    public void DeleteLocomotive(){}

    public void DeleteWagon() {
    }

    public void DeleteWagons(int quantity){}

    public void DeleteStation(UUID stationId) {

    }
    public void DeleteStations(UUID[] stationsId) {

    }

    public void DeleteConnections(List<Station> stations) {

    }
}
