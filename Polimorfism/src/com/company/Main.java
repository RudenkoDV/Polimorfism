package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Audi();
        System.out.println(Main.feelTheCar(audi, 10));

        Car bmw = new BMW();
        System.out.println(Main.feelTheCar(bmw, 20));
    }

    public static String feelTheCar(Car carType, Integer volume){
        return carType.fuel(volume);
    }
}
