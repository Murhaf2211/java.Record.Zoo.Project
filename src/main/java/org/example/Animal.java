package org.example;

public record Animal(
        String id,
        String name,
        Species specie,
        int age,
        Owner owner) {
}
