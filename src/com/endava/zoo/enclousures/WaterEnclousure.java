package com.endava.zoo.enclousures;

import com.endava.zoo.enums.HabitatType;

public class WaterEnclousure <Reptile, Mammal, Amphibian, Fish> extends Enclousure {
    public WaterEnclousure(int sizeInMeter, int capacity, HabitatType habitatType) {
        super(sizeInMeter, capacity, habitatType);
    }
}
