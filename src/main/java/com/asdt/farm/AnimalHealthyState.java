package com.asdt.farm;

public class AnimalHealthyState implements AnimalState {

    @Override
    public void act(AnimalState context, Animal animal) {
        if (!(animal.getState() instanceof AnimalTiredState)) {
            if (!(animal.getState() instanceof AnimalHungryTaste)) {
                animal.move();
            } else {
                animal.eat();
                animal.setState(new AnimalHungryTaste());
            }
        } else {
            animal.setState(new AnimalTiredState());
        }
    }
}
