package com.company;

public class Audi implements Car {
    @Override
    public String fuel(Integer volume) {
        return "Feel with " + volume + " liters disel Audi";
    }
}
