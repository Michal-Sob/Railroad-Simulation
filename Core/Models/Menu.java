package Core.Models;

import Core.Models.Wagons.Wagon;

import java.util.List;
import java.util.UUID;

public class Menu {


    //region Create

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

    //endregion

    //region Utilities

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

    //endregion

    //region Delete

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

    //endregion
}
