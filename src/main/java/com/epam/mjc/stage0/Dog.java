package com.epam.mjc.stage0;

public class Dog extends Animal {
  
  public Dog() {
        setColor("brown");
        setHasFur(true);
        setNumberOfPaws(4);
    }
  
  public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
}
