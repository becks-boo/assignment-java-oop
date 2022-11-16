package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Reptile;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Snake extends Reptile {

    public Snake(String name, String bodySurface, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, bodySurface, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void move() {
        System.out.println("Crawling.");
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
