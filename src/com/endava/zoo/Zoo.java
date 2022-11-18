package com.endava.zoo;

import com.endava.zoo.animals.Dog;
import com.endava.zoo.animals.Shark;
import com.endava.zoo.animals.Vulture;
import com.endava.zoo.animaltypes.Amphibian;
import com.endava.zoo.animaltypes.Bird;
import com.endava.zoo.animaltypes.Mammal;
import com.endava.zoo.animaltypes.Reptile;
import com.endava.zoo.enclousures.AirEnclousure;
import com.endava.zoo.enclousures.LandEnclousure;
import com.endava.zoo.enums.HabitatType;
import com.endava.zoo.enums.Sex;

import java.time.LocalDate;
import java.time.Month;

public class Zoo {

    public static void main(String[] args) {
        //TODO: Enclosures
        // Enclosure aquarium = new Aquarium();
        LandEnclousure<Reptile, Mammal, Amphibian> dogHouse = new LandEnclousure<>("Dog House", 10, 4);
        AirEnclousure<Bird, Mammal> birdHouse = new AirEnclousure<>("Big Birdcage",100, 8);

        //TODO: Animals
        // com.endava.zoo.animaltypes.Fish fish = new com.endava.zoo.animaltypes.Fish("Nemo", "Male");
        Dog dog1 = new Dog(null, 50, HabitatType.LAND, LocalDate.of(2015, Month.OCTOBER, 23), Sex.MALE);
        Dog dog2 = new Dog("Kiki", 30, HabitatType.LAND, LocalDate.of(2018, Month.AUGUST, 12), Sex.FEMALE);
        Vulture vulture1 = new Vulture("Otto", 80, LocalDate.of(2011, Month.APRIL, 1), Sex.MALE);
        Vulture vulture2 = new Vulture("Pini", 90, LocalDate.of(2005, Month.DECEMBER, 8), Sex.FEMALE);
        Shark shark1 = new Shark("Benny", 60, HabitatType.WATER, LocalDate.of(2000, Month.OCTOBER, 23), 233, Sex.FEMALE);

        //TODO: Add animals to enclosures
        // aquarium.addAnimal(fish);
        dogHouse.addAnimal(dog1);
        dog1.setName("Becks");
        dogHouse.addAnimal(dog2);

        if (dogHouse.belongsToEnclousure(shark1)) {
            System.out.println(shark1.getName() + " was added.\n");
        } else {
            System.out.println(shark1.getName() + " doesn't belong in the doghouse.\n");
        }

        if (dogHouse.belongsToEnclousure(vulture1)) {
            System.out.println(vulture1.getName() + " was added.\n");
        } else {
            System.out.println(vulture1.getName() + " doesn't belong in the doghouse.\n");
        }

        if (birdHouse.belongsToEnclousure(dog1)) {
            System.out.println(dog1.getName() + " was added.\n");
        } else {
            System.out.println(dog1.getName() + " doesn't belong in the birdcage.\n");
        }

        if (birdHouse.belongsToEnclousure(vulture1)) {
            System.out.println(vulture1.getName() + " was added.\n");
        } else {
            System.out.println(vulture1.getName() + " doesn't belong in the birdcage.\n");
        }

        //TODO: Print out the number of animals in each enclosure
        // System.out.println(aquarium.getAnimals().size());
        System.out.println(dogHouse);
        System.out.println(dog1.getName() + " is " + (dog1.ageInMonths(dog1.getBirthday()) / 12) + " years old.");
        System.out.println("Animals in the enclousure: " + dogHouse.getAnimalList().size());

        //TODO: Delete animals from enclosures
        // aquarium.removeAnimal(fish);
        dogHouse.removeAnimal(dog2);
        System.out.println(dogHouse);
        System.out.println(dog2.getName() + " has " + dog2.yearsToLive() + " years to live.");

        //TODO: Print out the number of animals in each enclosure
        // System.out.println(aquarium.getAnimals().size());
        System.out.println("Animals in the " + dogHouse.getName() + " : " + dogHouse.getAnimalList().size());
        birdHouse.addAnimal(vulture2);
        System.out.println("Animals in the " + birdHouse.getName() + " : " + birdHouse.getAnimalList().size());
        System.out.println(dog1.isBreastfed(LocalDate.of(2015, Month.OCTOBER, 23)));
    }
}
