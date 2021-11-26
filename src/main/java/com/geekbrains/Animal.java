package com.geekbrains;

public abstract class Animal {
    protected String name;
    protected static int animalCount;

    public abstract void run(int length);

    public abstract void sail(int length);

    public Animal(String name) {
        this.name = name;
        animalCount +=1;
    }

    public int getAnimalCount() {
        return animalCount;
    }
}
