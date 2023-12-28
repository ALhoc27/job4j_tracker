package ru.job4j.polymorphism;

public class MainFunction implements FunctionOne, FunctionTwo {

    @Override
    public double function(double x, double y) {
        return FunctionOne.super.function(x, y);
    }

    public double function1(double x, double y) {
        return FunctionTwo.super.function(x, y);
    }
}
