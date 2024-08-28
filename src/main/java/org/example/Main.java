package org.example;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("11", "Lion", "Leo",5);
        Animal lion2 = new Animal("11", "Lion", "Leo",5);
        Animal tiger = new Animal("22", "Tiger", "Tigra",3);
        Animal bear = new Animal("33", "Bear", "Balu",7);
        Animal elephant = new Animal("44", "Elephant", "Dumbo",10);

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