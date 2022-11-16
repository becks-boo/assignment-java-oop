package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Bird extends Animal {
    public Bird(String name, String bodySurface, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, bodySurface, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }
}
