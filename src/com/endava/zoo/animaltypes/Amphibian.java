package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Amphibian extends Animal {
    public Amphibian(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }
}
