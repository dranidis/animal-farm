package com.asdt.farm;

public class AnimalEatingState implements AnimalState {
    @Override
    public void act(AnimalState context, Animal animal) {
        animal.eat();
        animal.setState(new AnimalRunningState());
    }
}
