package com.epam.mjc.stage0;

class Bird extends Animal {
    
    public Bird() {
        System.out.println("This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.");

    }
    
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        if (isHasFur())
                if (getNumberOfPaws() > 1)
                    return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and a fur. Moreover, it has " + getNumberOfPaws() + " wings and can fly.";
                else
                    return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and a fur. Moreover, it has " + getNumberOfPaws() + " wing and can fly.";

        else if (!isHasFur()) {
            if (getNumberOfPaws() > 1)
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has " + getNumberOfPaws() + " wings and can fly.";
            else
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and no fur. Moreover, it has " + getNumberOfPaws() + " wing and can fly.";

        }
        else
            return "Error";

    }
}
