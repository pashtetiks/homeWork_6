package com.geekbrains;

public class Dog extends Animal {
    private static int dogCount;

    @Override
    public void run(int length) {
        if (length <= 500 && length > 0) {
            System.out.println("Собака " + this.name + " пробежала " + length + " м.");
        } else {
            System.out.println("Собака " + this.name + " не может столько пробежать");
        }
    }

    @Override
    public void sail(int length) {
        if (length <= 10 && length > 0) {
            System.out.println("Собака " + this.name + " проплыла " + length + " м.");
        } else {
            System.out.println("Собака " + this.name + " не может столько проплыть");
        }
    }

    public Dog(String name) {
        super(name);
        dogCount += 1;
    }

    public int getDogCount() {
        return dogCount;
    }
}
