package ua.chnu.edu.kkn.patterns.revisited.decorator;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {

    private Function<Color, Color> filter;

    public Camera(Function<Color, Color>... filters) {
        //filter = input -> input;
        //this.filter = Function.identity();
        /*for (var aFilter : filters) {
            filter = filter.andThen(aFilter);
        }*/
        this.filter = Stream.of(filters)
            .reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }
}
