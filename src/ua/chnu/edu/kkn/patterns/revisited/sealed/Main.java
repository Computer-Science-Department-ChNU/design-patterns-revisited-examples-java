package ua.chnu.edu.kkn.patterns.revisited.sealed;

//final class  BrokenLight implements TrafficLight {}

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight = new RedLight();
        System.out.println(trafficLight);
    }
}
