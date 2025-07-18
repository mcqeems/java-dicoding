package com.dicoding.javafundamental.inheritance;

import java.util.Objects;

public class Kucing extends Hewan implements Mamalia {
    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Kucing kucing)) return false;
        return Objects.equals(ras, kucing.ras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ras);
    }

    public Kucing(){
        System.out.println("Kucing sedang makan..");
    }

    public void makan(){
        System.out.println("Kucing sedang makan..");
    }

    public void makan (String food) {
        System.out.println("Kucing makan " + food);
    }
}
