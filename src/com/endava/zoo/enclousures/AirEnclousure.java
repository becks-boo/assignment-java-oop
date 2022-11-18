package com.endava.zoo.enclousures;

import com.endava.zoo.enums.HabitatType;

public class AirEnclousure <Bird, Mammal> extends Enclousure {
    public AirEnclousure(String name, int sizeInMeter, int capacity) {
        super(name, sizeInMeter, capacity, HabitatType.AIR);
    }
}
