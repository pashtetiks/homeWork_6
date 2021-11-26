package com.geekbrains;

public class Cat extends Animal {
    private static int catCount;

    @Override
    public void run(int length) {
        if (length <= 200 && length > 0) {
            System.out.println("Кот " + this.name + " пробежал " + length + " м.");
        } else {
            System.out.println("Кот " + this.name + " не может столько пробежать");
        }
    }

    @Override
    public void sail(int length) {
        System.out.println("Коты не умеют плавать");
    }

    public Cat(String name) {
        super(name);
        catCount += 1;
    }

    public int getCatCount() {
        return catCount;
    }

}
