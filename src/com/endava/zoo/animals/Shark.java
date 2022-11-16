package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Fish;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Shark extends Fish {
    public Shark(String name, String bodySurface, int sizeInCm, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, bodySurface, sizeInCm, birthday, lifeExpectancyInMonths, sex);
    }
}
