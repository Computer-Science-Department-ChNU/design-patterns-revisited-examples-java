package ua.chnu.edu.kkn.patterns.revisited.sealed;

import ua.chnu.edu.kkn.patterns.revisited.sealed.permits.TrafficLight2;

//final class  BrokenLight implements TrafficLight2 {}

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight = new RedLight();
        System.out.println(trafficLight);
    }
}
