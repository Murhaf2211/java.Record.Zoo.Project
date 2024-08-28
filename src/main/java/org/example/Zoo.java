package org.example;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int calculateTotalFoodRequirement() {
        return animals.stream()
                .mapToInt(animal -> animal.specie().foodRequirementInGramsPerDay())
                .sum();
    }


}
