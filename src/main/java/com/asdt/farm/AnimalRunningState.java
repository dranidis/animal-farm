package com.asdt.farm;

public class AnimalRunningState implements AnimalState {

    @Override
    public void act(AnimalState context, Animal animal) {
        animal.move();
        if (animal.isTired()) {
            animal.setState(new AnimalSleepingState());
        } else {
            animal.setState(new AnimalEatingState());
        }
    }
}
