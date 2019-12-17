package com.asdt.farm;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Dog dog = new Dog("Lucy", new AnimalHealthyState());

        farm.accept(dog);

        farm.simulateSteps(7);
    }
}
