package com.asdt.farm;

public class AnimalHealthyState implements AnimalState {

    @Override
    public void act(AnimalState context, Animal animal) {
        if (!(animal.getState() instanceof AnimalTiredState)) {
            if (!(animal.getState() instanceof AnimalHungryState)) {
                animal.move();
            } else {
                animal.eat();
                animal.setState(new AnimalHungryState());
            }
        } else {
            animal.setState(new AnimalTiredState());
        }
    }
}
