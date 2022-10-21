package com.epam.mjc.stage0;

public class Animal {
  String color;
    int numberOfPaws;
    boolean hasFur;


    public Animal() {

    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {

        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }


    public String getDescription() {
        return "This animal is mostly " + color + " It has " + numberOfPaws + " paw and " + " a " + hasFur ;

    }
}
