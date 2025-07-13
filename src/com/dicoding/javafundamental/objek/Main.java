package com.dicoding.javafundamental.objek;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Kucing");
        Hewan elang = new Hewan("Elang");

        elang.beratHewan(8);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();

        kucing.beratHewan(2);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();
    }
}
