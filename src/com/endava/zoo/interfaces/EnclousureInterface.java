package com.endava.zoo.interfaces;

import com.endava.zoo.Animal;

import java.util.ArrayList;

public interface EnclousureInterface {

    void openEnclousure();
    void closeEnclousure();
    void cleanEnclousure();
    boolean addAnimal(Animal animal);
    ArrayList<Animal> removeAnimal(Animal animal);
}
