package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;
import java.util.Date;

public abstract class Mammal extends Animal {
    int gestationPeriodInDays;

    public Mammal(String name, String bodySurface, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex, int gestationPeriodInDays) {
        super(name, bodySurface, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
        this.gestationPeriodInDays = gestationPeriodInDays;
    }


    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void move() {

    }

    @Override
    public void procreate() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void excrete() {

    }
}
