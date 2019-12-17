package com.asdt.farm;

public class AnimalHungryTaste implements AnimalState {
    @Override
    public void act(AnimalState context, Animal animal) {
        animal.eat();
        animal.setState(new AnimalHealthyState());
    }
}
