package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
