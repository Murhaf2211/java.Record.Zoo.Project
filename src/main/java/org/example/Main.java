package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner owner1= new Owner("Sara", 33, "Adress 123");
        Owner owner2= new Owner("Jack", 43, "Adress 777");
        Owner owner3= new Owner("John", 55, "Adress 789");

        Species species1= new Species("leo" , 5000);
        Species species2= new Species("Tigra" , 10000);
        Species species3= new Species("Dumbo" , 20000);

        Animal lion = new Animal("11", "Lion", species1,5,owner1 );
        Animal lion2 = new Animal("11", "Lion", species1,5, owner2);
        Animal tiger = new Animal("22", "Tiger", species2,3, owner2);
        Animal bear = new Animal("33", "Bear", species2,7, owner3);
        Animal elephant = new Animal("44", "Elephant", species3,10,owner1);
        System.out.println("---------------");
        System.out.println(lion);
        System.out.println(lion.owner());
        System.out.println(lion.specie());
        System.out.println("---------------");
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(elephant);
        System.out.println("---------------");
        System.out.println(lion.equals(tiger));
        System.out.println(lion.equals(lion2));
        System.out.println("---------------");
        Zoo zoo = new Zoo(List.of(lion, lion2, tiger, bear, elephant));
        System.out.println(zoo);
        System.out.println("---------------");
        // Print total food requirement of all animals in the Zoo
        System.out.println("Total food requirement for all animals in the Zoo: "
                + zoo.calculateTotalFoodRequirement() + " grams per day");
    }
}



//Let each Animal have a Species.
//
//In your main method, let multiple Animal objects have the same Species.
//
//If you have already completed this task earlier, you can work on the bonus task on the next page.