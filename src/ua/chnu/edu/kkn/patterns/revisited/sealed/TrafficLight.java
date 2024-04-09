package ua.chnu.edu.kkn.patterns.revisited.sealed;

public sealed interface TrafficLight { }

final class RedLight implements TrafficLight {}
final class YellowLight implements TrafficLight {}
final class GreenLight implements TrafficLight {}
