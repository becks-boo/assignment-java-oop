package com.endava.zoo.enclousures;

import com.endava.zoo.Animal;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.interfaces.EnclousureInterface;

import java.util.ArrayList;

public abstract class Enclousure implements EnclousureInterface {
    private int sizeInMeter;
    private int capacity;
    private ArrayList<Animal> animalList = new ArrayList<>();
    private final HabitatType habitatType;

    public Enclousure(int sizeInMeter, int capacity, HabitatType habitatType) {
        this.sizeInMeter = sizeInMeter;
        this.capacity = capacity;
        this.habitatType = habitatType;
    }

    public int getSizeInMeter() {
        return sizeInMeter;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public HabitatType getHabitatType() {
        return habitatType;
    }


    @Override
    public boolean addAnimal(Animal animal) {
        if (habitatType == animal.getHabitat()) {
            return animalList.add(animal);
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<Animal> removeAnimal(Animal animal) {
        animalList.remove(animal);
        return animalList;
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
