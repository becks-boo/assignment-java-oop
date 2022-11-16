package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;
import java.time.Period;

public class Dog extends Mammal {
    final int maxBreastfeedAgeInDays = 42;

    public Dog(String name, String bodySurface, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex, int gestationPeriodInDays) {
        super(name, bodySurface, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex, gestationPeriodInDays);
    }

    public int ageInDays(LocalDate birthday) {
        LocalDate today = LocalDate.now();

        return Period.between(birthday, today).getDays();
    }

    public boolean isBreastfed(int age) {
        return (age <= maxBreastfeedAgeInDays);
    }
}
