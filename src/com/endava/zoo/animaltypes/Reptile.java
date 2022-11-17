package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Reptile extends Animal {
    public Reptile(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
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
