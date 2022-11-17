package com.endava.zoo;

import com.endava.zoo.animals.Dog;
import com.endava.zoo.animals.Shark;
import com.endava.zoo.animaltypes.Amphibian;
import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.animaltypes.Reptile;
import com.endava.zoo.enclousures.Enclousure;
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

        //TODO: Animals
        // com.endava.zoo.animaltypes.Fish fish = new com.endava.zoo.animaltypes.Fish("Nemo", "Male");
        Dog dog1 = new Dog(null, 50, HabitatType.LAND, LocalDate.of(2015, Month.OCTOBER, 23), Sex.MALE);
        Dog dog2 = new Dog("Smeura", 30, HabitatType.LAND, LocalDate.of(2018, Month.AUGUST, 12), Sex.FEMALE);

        //TODO: Add animals to enclosures
        // aquarium.addAnimal(fish);
        dogHouse.addAnimal(dog1);
        dog1.setName("Becks");
        dogHouse.addAnimal(dog2);
        boolean isBennyInClousure = dogHouse.addAnimal(new Shark("Benny", 60, HabitatType.WATER, LocalDate.of(2000, Month.OCTOBER, 23), 233, Sex.FEMALE));
        if (isBennyInClousure) {
            System.out.println("Benny was added.");
        } else {
            System.out.println("Benny doesn't belong in the doghouse");
        }
        //TODO: Print out the number of animals in each enclosure
        // System.out.println(aquarium.getAnimals().size());
        System.out.println(dogHouse);

        System.out.println(dog1.ageInMonths(dog1.getBirthday()));
        System.out.println(dogHouse.getAnimalList().size());

        //TODO: Delete animals from enclosures
        // aquarium.removeAnimal(fish);
        dogHouse.removeAnimal(dog2);
        System.out.println(dogHouse);
        System.out.println(dog2.yearsToLive());

        //TODO: Print out the number of animals in each enclosure
        // System.out.println(aquarium.getAnimals().size());
    }
}
