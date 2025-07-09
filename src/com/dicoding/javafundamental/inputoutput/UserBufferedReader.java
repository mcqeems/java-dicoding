package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
	public static void main(String[] args) {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		System.out.println("Program penjumlahan sangat sederhana");
		int values = 0;
		int anotherValue = 0;
		try {
			System.out.println("Masukkan angka pertama : ");
			values = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Masukkan angka kedua : ");
			anotherValue = Integer.parseInt(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}
		int result = values + anotherValue;
		System.out.println("Hasilnya adalah : " + result);
	}
}
