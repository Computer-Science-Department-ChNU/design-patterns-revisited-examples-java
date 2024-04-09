package ua.chnu.edu.kkn.patterns.revisited.default_factory_method;

import ua.chnu.edu.kkn.patterns.revisited.Main;

public interface Person {

    Pet getPet();

    /**
     * Left here as an example
     */
    default void play(Pet pet) {
        System.out.println("Playing with " + pet);
    }

    /**
     * A better way
     * Essentially default method provide partial implementation and abstract method
     * can serve as a factory method, so we capture common behavior in the interface
     * and derived classes actual implementation by factory method, so this is a way
     * of thinking about this as a factory pattern and default methods along with
     * abstract methods can provide these benefits.
     */
    default void play() {
        System.out.println("Playing with " + getPet());
    }
}

class DogPerson implements Person {

    Pet dog = new Dog();

    @Override
    public Pet getPet() {
        return dog;
    }
}

class CatLover implements Person {

    Pet pet = new Cat();

    @Override
    public Pet getPet() {
        return pet;
    }
}
