package com.epam.mjc.stage0;

public class Dog extends Animal {
  
  public Dog() {
        System.out.println("This animal is mostly brown. It has 4 paws and a fur.");
    }
  
  public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
}
