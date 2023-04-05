package Core.Models.Wagons;

import Core.Interfaces.ElectricWagon;

import java.util.UUID;

public class BaggageMailWagon extends Wagon implements ElectricWagon {
    public BaggageMailWagon(UUID id) {
        super(id);
    }
}
