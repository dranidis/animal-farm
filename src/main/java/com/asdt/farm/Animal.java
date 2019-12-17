package com.asdt.farm;

public abstract class Animal {

    private AnimalState state;
	protected abstract AnimalState getState();
	protected abstract void move();
	protected abstract void eat();
    protected abstract void sleep();

    public Animal (AnimalState state) {
        this.state = state;
    }

    public void setState(AnimalState newState) {
        state = newState;
    }

    public void simulateStep() {
        state.act(state, this);
    }


}
