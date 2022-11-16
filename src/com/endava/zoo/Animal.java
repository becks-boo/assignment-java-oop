package com.endava.zoo;

import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;
import com.endava.zoo.interfaces.AnimalInterface;

import java.time.LocalDate;

public abstract class Animal implements AnimalInterface {
    private String name;
    public String bodySurface;
    public int sizeInCm;

    private HabitatType habitatType;
    private final LocalDate birthday;
    private final int lifeExpectancyInMonths;
    private final Sex sex;

    public Animal(String name, String bodySurface, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        this.name = name;
        this.bodySurface = bodySurface;
        this.sizeInCm = sizeInCm;
        this.habitatType = habitatType;
        this.birthday = birthday;
        this.lifeExpectancyInMonths = lifeExpectancyInMonths;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getLifeExpectancyInMonths() {
        return lifeExpectancyInMonths;
    }

    public Sex getSex() {
        return sex;
    }

    public HabitatType getHabitat() { return habitatType; }
}
