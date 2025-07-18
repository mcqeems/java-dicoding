package com.dicoding.javafundamental.generics;

public class Planet2 {
    private String name;
    private double mass;

    public Planet2(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print(){
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
