package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Mammal extends Animal {
    private final int pregnancyInDays;

    public Mammal(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex, int pregnancyInDays) {
        super(name, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
        this.pregnancyInDays = pregnancyInDays;
    }

    public int getPregnancyInDays() {
        return pregnancyInDays;
    }
}
