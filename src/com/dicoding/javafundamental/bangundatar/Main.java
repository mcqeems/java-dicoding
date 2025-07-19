package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang opersegi = new PersegiPanjang();
        SikuSiku osikusiku = new SikuSiku();
        Lingkaran olingkaran = new Lingkaran();
        int s1, s2, r;

        mainMenu();

        switch(pilihan){
            case '1': {
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang adalah: " + opersegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang adalah: " + opersegi.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukkan sisi 1 siku siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan sisi 2 siku siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas siku siku adalah: " + osikusiku.luas(s1, s2));
                System.out.println("Keliling siku siku adalah: " + osikusiku.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran adalah: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran adalah: " + olingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("Pilihan tidak valid");
                break;
            }
        }
    }

    private static void mainMenu(){
        System.out.println("===========================");
        System.out.println("Hitung luas dan keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Pilih menu: ");
        pilihan = scanner.next().charAt(0);
    }
}
