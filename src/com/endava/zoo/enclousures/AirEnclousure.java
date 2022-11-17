package com.endava.zoo.enclousures;

import com.endava.zoo.enums.HabitatType;

public class AirEnclousure <Bird, Mammal> extends Enclousure {
    public AirEnclousure(int sizeInMeter, int capacity, HabitatType habitatType) {
        super(sizeInMeter, capacity, habitatType);
    }
}
