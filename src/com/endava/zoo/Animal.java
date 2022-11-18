package com.endava.zoo;

import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;
import com.endava.zoo.interfaces.AnimalInterface;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal implements AnimalInterface {
    private String name;
    private int sizeInCm;
    private final HabitatType habitatType;
    private final LocalDate birthday;
    private final int lifeExpectancyInMonths;
    private final Sex sex;

    public Animal(String name, int sizeInCm, HabitatType habitatType, LocalDate birthday, int lifeExpectancyInMonths, Sex sex) {
        this.name = name;
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

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
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

    public int ageInMonths(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        int years = Period.between(birthday, today).getYears();
        return years * 12;
    }

    public int yearsToLive() {
        int age = ageInMonths(birthday);
        int months = lifeExpectancyInMonths - age;
        return months / 12;
    }

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking.");
    }

    @Override
    public void procreate() {
        System.out.println("Having fun time.");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing.");
    }

    @Override
    public void excrete() {
        System.out.println("Excreting.");
    }

    @Override
    public void move() {
        System.out.println("Moving.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sizeInCm=" + sizeInCm +
                ", habitatType=" + habitatType +
                ", birthday=" + birthday +
                ", lifeExpectancyInMonths=" + lifeExpectancyInMonths +
                ", sex=" + sex +
                '}';
    }
}
