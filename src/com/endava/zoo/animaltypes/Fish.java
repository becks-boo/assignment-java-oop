package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Fish extends Animal {
    public Fish(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }

    @Override
    public void move() {
        System.out.println("Swimming. Moving with fins.");
    }

    @Override
    public void procreate() {
        System.out.println("Laying eggs.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing through gills.");
    }
}
