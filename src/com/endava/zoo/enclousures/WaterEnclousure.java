package com.endava.zoo.enclousures;

import com.endava.zoo.enums.HabitatType;

public class WaterEnclousure <Reptile, Mammal, Amphibian, Fish> extends Enclousure {
    public WaterEnclousure(String name, int sizeInMeter, int capacity) {
        super(name, sizeInMeter, capacity, HabitatType.WATER);
    }
}
