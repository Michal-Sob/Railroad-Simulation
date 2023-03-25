package Core.Models;

import java.util.List;

public class Train {
    public final Station HOME_STATION;
    public Station startStation;
    public Station endStation;

    public Locomotive locomotive;
    public List<Wagon> wagons;

    public Train(
            Station homeStation,
            Station startStation,
            Station endStation
    ) {
        HOME_STATION = homeStation;
        this.startStation = startStation;
        this.endStation = endStation;

        //locomotive = new Locomotive();

    }

    public void setRoute() {

    }
}
