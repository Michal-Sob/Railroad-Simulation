package Core.Models.Wagons;

import java.util.UUID;

public abstract class Wagon {
    public final UUID ID;
    public int WEIGHT;

    public Wagon(UUID id) {
        ID = id;
    }
}
