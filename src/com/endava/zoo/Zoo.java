package com.endava.zoo;

import com.endava.zoo.animals.Dog;
import com.endava.zoo.animals.Shark;
import com.endava.zoo.animaltypes.Amphibian;
import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.animaltypes.Reptile;
import com.endava.zoo.enclousures.LandEnclousure;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;
import java.time.Month;

public class Zoo {

    public static void main(String[] args) {
        //TODO: Enclosures
        // Enclosure aquarium = new Aquarium();
        LandEnclousure<Reptile, Mammal, Amphibian> dogHouse = new LandEnclousure<>(10, 4, HabitatType.LAND);
        Dog animal = new Dog(null, null, 12, HabitatType.LAND, null, 192, Sex.MALE, 60);
        dogHouse.addAnimal(animal);
        // dogHouse.addAnimal(new Shark("benny", "scale", 60, LocalDate.of(2000, Month.OCTOBER, 23), 233, Sex.FEMALE));

        System.out.println(dogHouse);
        animal.setName("Becks");
        //TODO: Animals
        // com.endava.zoo.animaltypes.Fish fish = new com.endava.zoo.animaltypes.Fish("Nemo", "Male");

        //TODO: Add animals to enclosures
        // aquarium.addAnimal(fish);

        //TODO: Print out the number of animals in each enclosure
        // System.out.println(aquarium.getAnimals().size());

        //TODO: Delete animals from enclosures
        // aquarium.removeAnimal(fish);

        //TODO: Print out the number of animals in each enclosure
        // System.out.println(aquarium.getAnimals().size());
    }
}
