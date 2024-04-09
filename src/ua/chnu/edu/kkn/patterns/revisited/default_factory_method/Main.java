package ua.chnu.edu.kkn.patterns.revisited.default_factory_method;

public class Main {

    public static void call(Person person) {
        person.play();
    }

    public static void main(String[] args) {
        call(new DogPerson());
        call(new CatLover());
    }
}
