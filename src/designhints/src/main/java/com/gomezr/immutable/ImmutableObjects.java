package com.gomezr.immutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;

@RequiredArgsConstructor
public class ImmutableObjects {
    private final SpeedCalculator speedCalculator;

    public int calculateIt(Dog dog) {
        int speed = speedCalculator.calculateSpeed(dog);
        dog = dog.withSpeed(speed);
        //do stuff with new dog speed

        System.out.println(dog.getSpeed());
        return dog.getSpeed();
    }
}

@Data
@AllArgsConstructor
class Dog {
    private String name;
    @With
    final private int speed;
}

class SpeedCalculator {
    public int calculateSpeed(Dog dog) {
        //do some logic
        //check by age and race
        return 10;
    }
}