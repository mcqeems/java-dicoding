package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        int T;

        System.out.println("Contoh if tiga kasus");

        System.out.print("Suhu (der. c) = ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if(T < 0){
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)){
            System.out.println("Wujud air cair " + T);
        } else if (T > 100){
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
