package com.endava.zoo.animals;

import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;

public class Dog extends Mammal {
    final int maxBreastfeedAgeInDays = 42;

    public Dog(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, Sex sex) {
        super(name, sizeInCm, habitatType, birthday, 144, sex, 63);
    }

/*    public boolean isBreastfed(LocalDate birthday) {
        int age =
        return (age <= maxBreastfeedAgeInDays);
    }*/

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void move() {
        System.out.println("Walking on four legs.");
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
