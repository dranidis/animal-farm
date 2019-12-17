package com.asdt.farm;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Dog dog = new Dog("Lucy");
<<<<<<< Updated upstream
=======
        Sloth sloth = new Sloth("Flash");
>>>>>>> Stashed changes

        farm.accept(dog);

        farm.simulateSteps(25);
    }
}
