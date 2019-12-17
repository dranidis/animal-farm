package com.asdt.farm;

public class AnimalTiredState implements AnimalState {

    @Override
    public void act (AnimalState context, Animal animal) {
        animal.sleep();
        animal.setState(new AnimalHealthyState());
    }
}
