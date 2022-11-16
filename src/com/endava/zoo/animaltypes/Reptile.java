package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Reptile extends Animal {
    String bodySurface = "scale";

    public Reptile(String name, String bodySurface, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, bodySurface, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public abstract void move();

    @Override
    public void procreate() {
        System.out.println("Laying eggs.");
    }
}
