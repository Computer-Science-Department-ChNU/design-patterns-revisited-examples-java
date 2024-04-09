package ua.chnu.edu.kkn.patterns.revisited.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        var optionalSample = new OptionalSample();

        // using Optional as method parameters or class field is not great api design, omit using it
        optionalSample.setName(Optional.empty());
        optionalSample.setName(Optional.of("John"));
        // method overload is more preferable in such cases
        optionalSample.setName();
        optionalSample.setName("John");

        Optional<String> name = Optional.of("John");

        // not so much cause can throw unexpected exception and is not intuitive, omit using get()
        name.get();

        // use orElse() instead, it is much better option because it has clear intention
        name.orElse("");
        // in case of failure use orElseThrow(), it is much better option because it has clear intention
        name.orElseThrow();
    }
}
