package ua.chnu.edu.kkn.patterns.revisited.decorator;

import java.awt.*;

public class Main {

    public static void print(Camera camera) {
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }

    public static void main(String[] args) {
        print(new Camera());
        print(new Camera(Color::brighter));
        print(new Camera(Color::darker));
        print(new Camera(Color::darker, Color::brighter));
    }
}
