package com.gomezr.immutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableObjects {
    private final SpeedCalculator speedCalculator;

    public int calculateIt(Dog dog) {
        speedCalculator.calculateSpeed(dog);
        //do stuff with new dog speed
        System.out.println(dog.getSpeed());
        return dog.getSpeed();
    }
}

@Data
@AllArgsConstructor
class Dog {
    private String name;
    //@With
    private int speed;
}

class SpeedCalculator {
    public void calculateSpeed(Dog dog) {
        //do some logic
        dog.setSpeed(10);
    }
}