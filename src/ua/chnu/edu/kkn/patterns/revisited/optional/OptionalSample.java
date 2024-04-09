package ua.chnu.edu.kkn.patterns.revisited.optional;

import java.util.Optional;

public class OptionalSample {

    public void setNameMeh(String name) {
        if (name == null) {
            //some defaults
        }
        // use given name
    }

    public void setName(Optional<String> name) { // Bad idea
        if (name.isEmpty()) {
            //some defaults
        }
        // use given name
    }

    public void setName() {
        //code here
    }

    public void setName(String name) {
        //code here
    }

    /**
     * Caution of using Optional as a return type
     * @return intentionally returning null for demonstration that it is not safe as return type either
     */
    public Optional<String> getName() {
        return null; // Oh, no!
    }
}
