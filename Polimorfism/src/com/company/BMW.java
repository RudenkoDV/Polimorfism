package com.company;

public class BMW implements Car {
    @Override
    public String fuel(Integer volume) {
        return "Feel with " + volume + " liters benzin BMW";
    }
}
