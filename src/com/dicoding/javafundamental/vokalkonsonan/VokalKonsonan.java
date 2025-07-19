package com.dicoding.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        System.out.print("Masukkan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah vokal : " + vokal);
        System.out.println("Jumlah konsonan : " + konsonan);
    }

    private static int num_vokal(String word) {
        int i;
        int jumlah_vokal = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'b' || word.charAt(i) == 'c' || word.charAt(i) == 'd' || word.charAt(i) == 'f' || word.charAt(i) == 'g' || word.charAt(i) == 'h' || word.charAt(i) == 'j' || word.charAt(i) == 'k' || word.charAt(i) == 'l' || word.charAt(i) == 'm' || word.charAt(i) == 'n' || word.charAt(i) == 'p' || word.charAt(i) == 'q' || word.charAt(i) == 'r' || word.charAt(i) == 's' || word.charAt(i) == 't' || word.charAt(i) == 'v' || word.charAt(i) == 'w' || word.charAt(i) == 'x' || word.charAt(i) == 'y' || word.charAt(i) == 'z') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
