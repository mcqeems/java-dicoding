package com.dicoding.javafundamental.objek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    public Hewan(String namaHewan){
        this.nama = namaHewan;
    }

    public void beratHewan(int beratHewan){
        this.berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKaki){
        this.jumlahKaki = jumlahKaki;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan: " + nama);
        System.out.println("Berat hewan: " + berat + " kg");
        System.out.println("Jumlah hewan: " + jumlahKaki);
    }
}
