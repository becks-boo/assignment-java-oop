package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Dog extends Mammal {
    final int maxBreastfeedAgeInWeeks = 6;

    public Dog(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, 144, sex, 63);
    }

    public boolean isBreastfed(LocalDate birthday) {
        int ageInWeeks = ageInMonths(birthday) * 4;
        return (ageInWeeks <= maxBreastfeedAgeInWeeks);
    }

    @Override
    public void move() {
        System.out.println("Walking on four legs.");
    }
}
