package com.epam.mjc.stage0;

class Bird extends Animal {
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly " + color + " It has " + numberOfPaws + " paws and " + " no fur " + hasFur + " Moreover, it has " + numberOfPaws + " wings and can fly.";

    }
}
