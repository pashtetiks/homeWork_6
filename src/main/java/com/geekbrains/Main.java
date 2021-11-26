package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat catArseniy = new Cat("Арсений");
        Dog dogPavel = new Dog("Павел");
        Dog dogZlata = new Dog("Злата");
        catArseniy.run(150);
        catArseniy.run(400);
        catArseniy.sail(10);
        dogPavel.run(400);
        dogPavel.run(600);
        dogPavel.sail(9);
        dogPavel.sail(15);
        System.out.println(catArseniy.getCatCount());
        System.out.println(dogPavel.getDogCount());
        System.out.println(dogZlata.getDogCount());
        System.out.println(dogPavel.getAnimalCount());
        //Счетчик можно вызывать с любого объекта данного типа, показал на примере собак


    }
}
