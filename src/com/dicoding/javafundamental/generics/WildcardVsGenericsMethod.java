package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardVsGenericsMethod {
    static <T> void print(T[] a) {
        for (T o : a) {
            System.out.println(o);
        }
    }

    static <T> Collection arrayToCollection(T[] a){
        Collection<T> c = new ArrayList();
        for (T o : a){
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding"};
        Collection r = arrayToCollection(sa);
        print(sa);
    }
}
