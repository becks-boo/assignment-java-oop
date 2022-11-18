package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Bird;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Vulture extends Bird {
    public Vulture(String name, int sizeInCm, LocalDate birthday, Sex sex) {
        super(name, sizeInCm, HabitatType.AIR, birthday, 300, sex);
    }

    @Override
    public void move() {
        System.out.println("Flying.");
    }
}
