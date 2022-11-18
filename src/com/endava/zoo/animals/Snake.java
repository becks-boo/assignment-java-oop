package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Reptile;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Snake extends Reptile {
    public Snake(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, lifeExpectancyInMonths, sex);
    }

    @Override
    public void move() {
        System.out.println("Crawling.");
    }
}
