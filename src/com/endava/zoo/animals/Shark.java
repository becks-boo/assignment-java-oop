package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Fish;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Shark extends Fish {
    public Shark(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }
}
