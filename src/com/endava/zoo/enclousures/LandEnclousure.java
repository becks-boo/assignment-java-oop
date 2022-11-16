package com.endava.zoo.enclousures;

import com.endava.zoo.animaltypes.Amphibian;
import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.animaltypes.Reptile;
import com.endava.zoo.enums.HabitatType;

import java.util.ArrayList;

public class LandEnclousure<Reptile, Mammal, Amphibian> extends Enclousure {
    public LandEnclousure(int sizeInMeter, int capacity, HabitatType habitatType) {
        super(sizeInMeter, capacity, habitatType);

    }

    ArrayList<Mammal> dogList = new ArrayList<>();
}
