package com.endava.zoo.enclousures;

import com.endava.zoo.enums.HabitatType;

public class LandEnclousure<Reptile, Mammal, Amphibian> extends Enclousure {
    public LandEnclousure(String name, int sizeInMeter, int capacity) {
        super(name, sizeInMeter, capacity, HabitatType.LAND);
    }
}
