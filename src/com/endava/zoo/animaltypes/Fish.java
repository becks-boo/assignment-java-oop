package com.endava.zoo.animaltypes;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public abstract class Fish extends Animal {
    public Fish(String name, String bodySurface, int sizeInCm, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, bodySurface, sizeInCm, HabitatType.WATER, birthday, lifeExpectancyInMonths, sex);
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void move() {
        System.out.println("Moving with fins.");
    }

    @Override
    public void procreate() {
        System.out.println("Laying eggs.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void breathe() {
        System.out.println("Breathing through gills.");
    }

    @Override
    public void excrete() {

    }
}
