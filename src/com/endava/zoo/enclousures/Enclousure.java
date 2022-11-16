package com.endava.zoo.enclousures;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;

import java.util.ArrayList;

public class Enclousure {
    int sizeInMeter;
    int capacity;
    ArrayList<Animal> animalList = new ArrayList<>();
    HabitatType habitatType;

    public Enclousure(int sizeInMeter, int capacity, HabitatType habitatType) {
        this.sizeInMeter = sizeInMeter;
        this.capacity = capacity;
        this.habitatType = habitatType;
    }

    public void addAnimal(Animal animal) {
        if (habitatType == animal.getHabitat()) {
            animalList.add(animal);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Enclousure{" +
                "sizeInMeter=" + sizeInMeter +
                ", capacity=" + capacity +
                ", animalList=" + animalList +
                ", habitatType=" + habitatType +
                '}';
    }
}
