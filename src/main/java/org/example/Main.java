package org.example;

public class Main {
    public static void main(String[] args) {

        Owner owner1= new Owner("Sara", 33, "Adress 123");
        Owner owner2= new Owner("Jack", 43, "Adress 777");
        Owner owner3= new Owner("John", 55, "Adress 789");


        Animal lion = new Animal("11", "Lion", "Leo",5,owner1);
        Animal lion2 = new Animal("11", "Lion", "Leo",5, owner2);
        Animal tiger = new Animal("22", "Tiger", "Tigra",3, owner2);
        Animal bear = new Animal("33", "Bear", "Balu",7, owner3);
        Animal elephant = new Animal("44", "Elephant", "Dumbo",10, owner1);

        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(elephant);

        System.out.println(lion.equals(tiger));
        System.out.println(lion.equals(lion2));
    }
}
//Call the automatically generated methods in the Record and check
// if they do what you expect (equals, toString).
//Create an Owner Record that stores some properties of a pet owner (Name, Age, Address).
//
//Let each Animal have an Owner.
//Create a Species Record that stores the properties of an animal species (Name, Food requirement in grams per day).
//
//Let each Animal have a Species.
//
//In your main method, let multiple Animal objects have the same Species.
//
//If you have already completed this task earlier, you can work on the bonus task on the next page.