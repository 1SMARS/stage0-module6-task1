package com.epam.mjc.stage0;

class Bird extends Animal {
    
    public Bird() {
        
    }
    
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        if (hasFur)
                if (numberOfPaws > 1)
                    return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur. Moreover, it has " + numberOfPaws + " wings and can fly.";
                else
                    return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur. Moreover, it has " + numberOfPaws + " wing and can fly.";

        else if (!hasFur) {
            if (numberOfPaws > 1)
                return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur. Moreover, it has " + numberOfPaws + " wings and can fly.";
            else
                return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur. Moreover, it has " + numberOfPaws + " wing and can fly.";

        }
        else
            return "Error";

    }
}
