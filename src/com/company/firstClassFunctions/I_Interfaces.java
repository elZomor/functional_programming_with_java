package com.company.firstClassFunctions;

public class I_Interfaces {
    static class Cat implements Animal{

        @Override
        public void makeSound() {
            System.out.println("MEOOOOOW");
        }
    }
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("HAO HAO HAO");
            }
        };
        Animal lion = () -> System.out.println("AAAAAHAAA");

        cat.makeSound();
        dog.makeSound();
        lion.makeSound();
    }
}
