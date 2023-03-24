package Core.Models;

import Core.Enums.PowerSupply;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Locomotive {
    public final UUID ID;
    public final String NAME;
    public final Station HOME_STATION;
    public final int MAX_WAGONS;
    public final int MAX_ELECTRIC_WAGONS;
    public final int MAX_PULL;
    public final PowerSupply POWER_SUPPLY;
    public final int FUEL_TANK_VOLUME;

    public List<Wagon> wagons;
    public Station startStation;
    public Station endStation;

    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        var threePercentSpeed = 0.03 * this.speed;

        this.speed = speed * new Random().nextDouble(-threePercentSpeed, threePercentSpeed);
    }

    public Locomotive(
            String name,
            Station homeStation,
            Station startStation,
            Station endStation,
            int maxWagons,
            int maxElectricWagons,
            int maxPull,
            PowerSupply powerSupply,
            int fuelTankVolume) {
        ID = UUID.randomUUID();
        NAME = name;
        HOME_STATION = homeStation;
        this.startStation = startStation;
        this.endStation = endStation;
        MAX_WAGONS = maxWagons;
        MAX_ELECTRIC_WAGONS = maxElectricWagons;
        MAX_PULL = maxPull;
        POWER_SUPPLY = powerSupply;
        FUEL_TANK_VOLUME = fuelTankVolume; //rnd.nextInt(1000, 3000);
    }

    public void AddWagon(Wagon wagon) {
        //var wagons weight = wagons.stream().
        //if (wagon.WEIGHT > MAX_PULL)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Locomotive that)) return false;
        return ID.equals(that.ID) && NAME.equals(that.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, NAME);
    }
}
