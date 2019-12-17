package com.asdt.farm;

public class AnimalSleepingState implements AnimalState {

    @Override
    public void act (AnimalState context, Animal animal) {
        animal.sleep();
        animal.setState(new AnimalEatingState());
    }
}
